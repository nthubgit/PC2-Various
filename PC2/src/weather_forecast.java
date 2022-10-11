import java.util.Scanner;
public class weather_forecast {
	private String skyCondition;
	private Double temperature;

	//Constructors
	public weather_forecast() {
		skyCondition = "Sunny";
		temperature = 70.0;
	}
	public weather_forecast(String skyCondition, Double temperature) {
		this.skyCondition = skyCondition;
		this.temperature = temperature;
	}
	//Getters/Setters
	public String getSkyCondition() {
		return skyCondition;
	}
	public void setSkyCondition(String skyCondition) {
		this.skyCondition = skyCondition;
	}
	public Double getTemperature() {
		return temperature;
	}
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}
	//Celsius conversion
	public Double convertToCelsius (Double temperature) {
		return temperature = (temperature - 32) * 5 /9;
	}
	//toString
	public String toString (Boolean isCelsius) {
		if (isCelsius == false) {
			return "\nCurrent temperature: " + getTemperature() + " in Fahrenheit." + "\nCurrent sky condition: " + getSkyCondition() + "!";
		}
		else {
			return "\nCurrent temperature: " + convertToCelsius(temperature) + " in Celsius." + "\nCurrent sky condition: " + getSkyCondition() + "!";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Boolean continueForecast = true, isCelsius = false, inputValidation = false;
		int userInput, otherInput;
		Double tempTemperature;

		//Opening
		weather_forecast todaysWeather = new weather_forecast();
		while (continueForecast == true) {
			System.out.println("\n1- Show the last update in Fahrenheit." + "\n2- Show the last update in Celsius." + "\n3- Update." + "\n4- Exit." + "\nEnter your choice: ");
			userInput = keyboard.nextInt();
			switch (userInput) {
			//Show in Fahrenheit
			case 1:
				isCelsius = false;
				System.out.println(todaysWeather.toString(isCelsius));
				if (todaysWeather.getTemperature() > 32 || todaysWeather.getSkyCondition() == "Snowy") {
					System.out.println("Inconsistent weather!\n");
				}
				break;
			//Show in Celsius
			case 2:
				isCelsius = true;
				System.out.println(todaysWeather.toString(isCelsius));
				if (todaysWeather.getTemperature() > 32 || todaysWeather.getSkyCondition() == "Snowy") {
					System.out.println("Inconsistent weather!\n");
				}
				break;
			
			//Update weather
			case 3:
				//temp update
				inputValidation = false;
				while (inputValidation == false) {
					System.out.println("Input temperature in Fahrenheit (between -50 and 150):");
					tempTemperature = keyboard.nextDouble();
					if (tempTemperature >= -50 || tempTemperature <= 150) {
						todaysWeather.setTemperature(tempTemperature);
						inputValidation = true;
					}
					else {
						System.out.println("Invalid input!");
					}
				}
				//sky condition update
				inputValidation = false;
				while (inputValidation == false) {
					System.out.println("Input updated sky condition: 1- Sunny 2- Snowy 3- Cloudy 4- Rainy");
					otherInput = keyboard.nextInt();
					switch (otherInput) {
					case 1:
						todaysWeather.setSkyCondition("Sunny");
						inputValidation = true;
						break;
					case 2:
						todaysWeather.setSkyCondition("Snowy");
						inputValidation = true;
						break;
					case 3:
						todaysWeather.setSkyCondition("Cloudy");
						inputValidation = true;
						break;
					case 4:
						todaysWeather.setSkyCondition("Rainy");
						inputValidation = true;
						break;
					default:
						System.out.println("Invalid input!");
					}
				}
				break;
			//Exiting
			case 4:
				continueForecast = false;
				System.out.print("See you again, have a nice day!");
				break;
			
			//Invalid input
			default:
				System.out.print("Input must be between 1 and 4!");
				break;
			}
		}
		keyboard.close();
	}
}
