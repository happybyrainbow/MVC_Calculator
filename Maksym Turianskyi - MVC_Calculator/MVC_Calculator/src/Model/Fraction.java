package Model;

public class Fraction {

    private int num;
    private int denom;

    public Fraction(int pNum, int pDenom){
        num=pNum;
        denom=pDenom;
    }

    public void expand(int pFactor){
        if(pFactor!=0){
            num=num*pFactor;
            denom=denom*pFactor;
        }
    }

    public void shorten(){
        //TODO: Kürze die Brüche. Nutze dazu die Methode getGgt.
    }

    private int getGgt() {
        int tmpDenom=denom;
        int tmpNum=num;
        while (tmpDenom != 0) {
            if (tmpNum > tmpDenom) {
                tmpNum = tmpNum - tmpDenom;
            } else {
                tmpDenom = tmpDenom - tmpNum;
            }
        }
        return tmpNum;
    }

    //Weiterer Code

    public int getDenom() {
        return denom;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int pNum){
        num=pNum;
    }

    public void setDenom(int denom) {
        this.denom = denom;
    }
}
