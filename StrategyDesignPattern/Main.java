interface Operation{
    public int mathematicalResult(int num1, int num2);
}

class Calculator{
    private Operation operation;
    public void setOperation(Operation operation){
        this.operation=operation;
    }
    public int result( int num1 , int num2){
        return operation.mathematicalResult(num1 , num2);
    }
}

class Add implements Operation{
    public int mathematicalResult(int num1, int num2){
        return num1 + num2;
    }
}

class Sub implements Operation{
    public int mathematicalResult(int num1, int num2){
        return num1 - num2;
    }
}

class Mul implements Operation{
    public int mathematicalResult(int num1, int num2){
        return num1 * num2;
    }
}

class Div implements Operation{
    public int mathematicalResult(int num1, int num2){
        return num1 / num2;
    }
}

public class Main{
    public static void main( String[] args){
        Calculator calc = new Calculator();
        
        calc.setOperation(new Add());
        System.out.println("Addition : "+calc.result(10,5));
        
        calc.setOperation(new Sub());
        System.out.println("Subtract : "+calc.result(10,5));
        
        calc.setOperation(new Mul());
        System.out.println("Multiplity : "+calc.result(10,5));
        
        calc.setOperation(new Div());
        System.out.println("Division : "+calc.result(10,5));
    }
}
