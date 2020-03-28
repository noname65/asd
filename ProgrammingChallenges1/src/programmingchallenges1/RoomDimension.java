package programmingchallenges1;

/**
 * @author noname
 */
class RoomDimension {
    RoomDimension(double l,double w){
        this.l=l;
        this.w=w;
    }
    public double getArea(){
        return l*w;
    }
    @Override
    public String toString(){
        return "[length="+l+",width="+w+"]";
    }
    private final double l,w;
}
