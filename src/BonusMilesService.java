public class BonusMilesService {

    public int calculate(int ticketPrice) {
        int result;
        if (ticketPrice > 1000) {
            result = ticketPrice / 20;
        } else {
            result = 0;
        }
        return result;
    }

}
