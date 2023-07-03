
public class Statistics {

    
    private int count;
    private int sum;
    
    public Statistics() {
        
    }
    
    public void addNumber(int number){
        this.sum = this.sum + number;
        this.count++;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum (){
        if (this.sum == 0){
            return 0;
        }
        return this.sum;
    }
    
    public double average() {
        if (this.sum == 0){
            return 0;
        }
        return (double) this.sum/this.count;
    }

}
