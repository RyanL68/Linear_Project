public class Linearequation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Linearequation(int x1,int y1, int x2,int y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }

    public double Hround(double rounded){
        return Math.round(rounded*100)/100;
    }

    public double slope(){
        double slope = (double)(y2-y1)/(double)(x2-x1);
        return slope;
    }

    public double yintercept(){
        double slope = slope();
        double yintercept = Hround(y1-(slope*x1));
        return yintercept;
    }

    public double distance(){
        double distance = Math.sqrt(Math.pow(y2-y1,2)+Math.pow(x2-x1,2));
        return Hround(distance);
    }

    public String equation(){
        int changey = y2-y1;
        int changex = x2-x1;
        double yintercept = yintercept();
        String slope = "";

        if(y2 == y1){
            String s = "y = " + y1;
            return s;
        }


        if(changey % changex == 0){
            int delta = changey / changex;

            if(delta == 1){
                slope = "";
            }else{
                slope = String.valueOf(delta);
            }
            if (Math.abs(changex) > changex && Math.abs(changey) > changey) {
                slope = changey + "/" + changex;
            }
            // Check if one of them is negative
            else if (Math.abs(changex) > changex || Math.abs(changey) > changey) {
                slope = "-" + Math.abs(changey) + "/" + Math.abs(changex);
            }
            else {
                slope = changey + "/" + changex;
            }
        }
        if (yintercept == 0){
            return "y = "+slope+"x";
        } else if (Math.abs(yintercept)==yintercept) {
            return "y = "+slope+"x +"+yintercept;
        }else {
            return "y = "+slope+"x -"+Math.abs(yintercept);
        }

    }

    public void Newcoords(double XVAL) {
        double y;
        y= Hround(slope()*XVAL+yintercept());
        System.out.println("The New point on the line is: ("+XVAL+","+yintercept()+")");
    }
}




