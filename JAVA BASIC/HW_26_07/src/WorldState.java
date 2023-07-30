
    public class WorldState {

        boolean isWorldNegativlyGood = false;
        boolean isWorldPositivlyGood = true;

        boolean niceWhether = true;
        boolean goodHealth = true;
        boolean iAmNotHappy = false;
        boolean fallingInLove = false;
        boolean babyHealth = true;
        boolean muchMoneyInMyWallet = true;
        boolean interestingJob = true;
        // ! && ||
        public WorldState( boolean isWorldPositivlyGood , boolean isWorldNegativlyGood){
            this.isWorldPositivlyGood = (niceWhether && goodHealth && !iAmNotHappy && babyHealth) || (!fallingInLove || muchMoneyInMyWallet || interestingJob) ;
            this.isWorldNegativlyGood = (!niceWhether && !goodHealth && iAmNotHappy && !babyHealth) || (fallingInLove || !muchMoneyInMyWallet || !interestingJob) ;
        }
}
