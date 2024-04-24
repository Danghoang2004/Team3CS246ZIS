package bailam;

public class Sort {

    int number1;
    int number2;
// sắp xếp giảm dần
    public void sortDesc() {
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
    }

    // so sánh 2 số
    public void comparative() {
        if (number1 > number2) {
            int temp = number2;
            number1 = number2;
            number1 = temp;

        }
    }

    // sắp sếp tăng dần
    public void sortAsc() {
        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
    }
// kiểm tra 2 số có bằng nhau không
    public boolean isEqual() {
        return number1 == number2;
    }
}
