package task2;

public class Operation implements Calculator{
    private int value1;
    private int value2;
    private String result;

    @Override
    public void addValue() {
        this.result =  String.valueOf(this.value1 + this.value2);
    }

    @Override
    public void subValue() {
        this.result =  String.valueOf(this.value1 - this.value2);
    }

    @Override
    public void multiplyValue() {
        this.result =  String.valueOf(this.value1 * this.value2);
    }

    @Override
    public void divideValue() {
        if(this.value2 != 0){
            this.result = String.valueOf(this.value1 / this.value2);
        }else{
            this.result = "Tidak bisa dibagi dengan nol";
        }
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public String getResult() {
        return this.result;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    void showResult(){
        System.out.print("Hasil : "+this.getResult());
    }
}
