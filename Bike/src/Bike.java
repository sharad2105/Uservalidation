public class Bike<speed> {
        int speed=100;

        void bike(){

            System.out.println("speed is "+speed);
        }

        speed = speed+10;

        public static void main(String args[]){
            Bike b1=new Bike();
            Bike b2=new Bike();
            Bike b3=new Bike();
            b1.bike();
            b2.bike();
            b3.bike();
        }
}