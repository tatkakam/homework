import WeatherForecastTemplate.TemplateAnyDay;

public class Main {
    public static void main(String[] args) {
        TemplateAnyDay templateAnyDay1 = new TemplateAnyDay();

        System.out.println(templateAnyDay1.todayIs + templateAnyDay1.nameOfTheDay);
        System.out.println("Expected to be " + templateAnyDay1.weatherForecast + templateAnyDay1.temperature);
        System.out.println(templateAnyDay1.weatherAssessment);


        TemplateAnyDay templateAnyDay2 = new TemplateAnyDay();


        templateAnyDay2.nameOfTheDay = "Tusday";
        templateAnyDay2.weatherForecast = "cloudy, chance of rain in the afternoon.";
        templateAnyDay2.temperature = " plus 20'C." ;
        templateAnyDay2.weatherAssessment = "Don't forget the umbrella." ;

        System.out.println(templateAnyDay1.todayIs + templateAnyDay2.nameOfTheDay);
        System.out.println("Expected to be " + templateAnyDay2.weatherForecast + templateAnyDay2.temperature);
        System.out.println(templateAnyDay2.weatherAssessment);

        TemplateAnyDay templateAnyDay3 = new TemplateAnyDay();

        templateAnyDay3.nameOfTheDay = "Wednesday";
        templateAnyDay3.weatherForecast = "most cloudy, rainy all the day.";
        templateAnyDay3.temperature = " plus 17'C." ;
        templateAnyDay3.weatherAssessment = "Not the most pleasant day. Don't forget the umbrella." ;

        System.out.println(templateAnyDay1.todayIs + templateAnyDay3.nameOfTheDay);
        System.out.println("Expected to be " + templateAnyDay3.weatherForecast + templateAnyDay3.temperature);
        System.out.println(templateAnyDay3.weatherAssessment);

        TemplateAnyDay templateAnyDay4 = new TemplateAnyDay();

        templateAnyDay4.nameOfTheDay = "Thursday";
        templateAnyDay4.weatherForecast = "sunny, windly.";
        templateAnyDay4.temperature = " plus 22'C." ;


        System.out.println(templateAnyDay1.todayIs + templateAnyDay4.nameOfTheDay);
        System.out.println("Expected to be " + templateAnyDay4.weatherForecast + templateAnyDay4.temperature);
        System.out.println(templateAnyDay1.weatherAssessment);


        TemplateAnyDay templateAnyDay5 = new TemplateAnyDay();

        templateAnyDay5.nameOfTheDay = "Friday";
        templateAnyDay5.weatherForecast = "cloudy, chance of rain tonight.";
        templateAnyDay5.temperature = " plus 24'C." ;
        templateAnyDay5.weatherAssessment = "Very nice weather for gardeners" ;

        System.out.println(templateAnyDay1.todayIs + templateAnyDay5.nameOfTheDay);
        System.out.println("Expected to be " + templateAnyDay5.weatherForecast + templateAnyDay5.temperature);
        System.out.println(templateAnyDay5.weatherAssessment);


        TemplateAnyDay templateAnyDay6 = new TemplateAnyDay();

        templateAnyDay6.nameOfTheDay = "Saturday";
        templateAnyDay6.weatherForecast = "clear and sunny.";
        templateAnyDay6.temperature = " plus 25'C." ;
        templateAnyDay6.weatherAssessment = "it's a great day for barbecue!" ;

        System.out.println(templateAnyDay1.todayIs + templateAnyDay6.nameOfTheDay);
        System.out.println("Expected to be " + templateAnyDay6.weatherForecast + templateAnyDay6.temperature);
        System.out.println(templateAnyDay6.weatherAssessment);


        TemplateAnyDay templateAnyDay7 = new TemplateAnyDay();

        templateAnyDay7.nameOfTheDay = "Sunday";
        templateAnyDay7.weatherForecast = "very sunny, stuffy.";
        templateAnyDay7.temperature = " plus 32'C." ;
        templateAnyDay7.weatherAssessment = "This is the highest daily temperature in the last 10 years" ;

        System.out.println(templateAnyDay1.todayIs + templateAnyDay7.nameOfTheDay);
        System.out.println("Expected to be " + templateAnyDay7.weatherForecast + templateAnyDay7.temperature);
        System.out.println(templateAnyDay7.weatherAssessment);

    }
}