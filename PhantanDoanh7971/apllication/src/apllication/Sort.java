
package apllication;

public class Sort {
    int number1;
    int number2;
    // sắp xếp giảm
    public void sortDesc() {
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
    }
    // sắp sếp tăng
    public void sortAsc() {
        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
    }
    // kiểm tra 2 số có bằng nhau
    public boolean isEqual() {
        return number1 == number2;
    }

}
