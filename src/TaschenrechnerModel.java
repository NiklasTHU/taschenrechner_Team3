public class TaschenrechnerModel {
    private int ersterOperand;
    private int zweiterOperand;
    private String operator;

    public void setErsterOperand(int ersterOperand) {
        this.ersterOperand = ersterOperand;
    }

    public void setZweiterOperand(int zweiterOperand) {
        this.zweiterOperand = zweiterOperand;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getErgebnis(){
        int erg=0;
        if (this.operator == "+"){
            erg = this.ersterOperand + this.zweiterOperand;
        }else if (this.operator == "-"){
            erg = this.ersterOperand - this.zweiterOperand;
        }else{
            erg = this.zweiterOperand;
        }
        return erg;
    }

    public void zurücksetzen(){
        this.operator=null;
    }
}
