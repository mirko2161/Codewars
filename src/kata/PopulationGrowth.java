package kata;

/**
 * See https://www.codewars.com/kata/growth-of-a-population
 *
 * In a small town the population is p0 = 1000 at the beginning of a year. The population regularly
 * increases by 2 percent per year and moreover 50 new inhabitants per year come to live in the
 * town. How many years does the town need to see its population greater or equal to p = 1200
 * inhabitants?
 *
 * More generally given parameters:
 *
 * p0, percent, aug (inhabitants coming or leaving each year), p (population to surpass)
 *
 * the function nb_year should return n number of entire years needed to get a population greater or
 * equal to p.
 *
 * aug is an integer, percent a positive or null number, p0 and p are positive integers (> 0)
 *
 * Examples: nb_year(1500, 5, 100, 5000) -> 15 nb_year(1500000, 2.5, 10000, 2000000) -> 10
 *
 * Note: Don't forget to convert the percent parameter as a percentage in the body of your function:
 * if the parameter percent is 2 you have to convert it to 0.02.
 *
 * @author mirko
 */
public class PopulationGrowth {

    public static int nbYear(int population, double growthPercent, int newSettlers, int popToSurpass) {
        int numOfYears = 0;
        while (population < popToSurpass) {
            numOfYears++;
            population += population * growthPercent / 100 + newSettlers;
        }
        return numOfYears;
    }

}
