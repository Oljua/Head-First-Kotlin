# � ��������

�������� �� �������� ��������� ���� 
� ���������� �� � ������ ������� ����. 
������ �������� ����� �������������� ������ ���� ���; ������������ ��� 
��������� �� �����������. ���� ������: �������� ���, ������� ������� 
��������� ���������

```java  
class Rectangle(var widgh: Int, var height: Int) {
    val isSquare: Boolean
       .......(widgh == height)

    val area: Int
       .......(widgh * height)
}

fun main() {
    var r = arrayOf(Rectangle(1, 1), Rectangle(1, 1),
                    Rectangle(1, 1), Rectangle(1, 1))
    for (x in 0.. .......) {
        ........widgh = (x + 1) * 3
        ........height = x + 5
        print("Rectangle $x has area ${........}. ")
        println("It is ${if (........) "" else "not "}a square.")
    }
}
``` 
![](https://github.com/Oljua/Head-First-Kotlin/blob/main/screenshots/TaskNearPoolApp4.png)