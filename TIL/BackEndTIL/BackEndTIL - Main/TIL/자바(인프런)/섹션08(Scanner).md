
 # Scanner
  ### System.in을 통해 사용자의 입력을 받는다.
  ### Scanner클래스를 이용해서 사용한다.
  #### 1. import java.util.Scanner
  #### 2. Scanner (변수명) = new Scanner(System.in)
  #### 3(1). String (변수명) = scanner.nextLine()(문자열일떄)
  #### 3(2). int (변수명) = scanner.nextInt()(정수형일때)
  #### 3(3). double (변수명) = scanner.nextDouble()(실수형일때)
    package Scanner;

    import java.util.Scanner;

    public class Scanner1 {
    public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in); //new를 사용해서 Scanner를 사용한다. System.in은 사용자 입력을 편리하게 만든다.

        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine(); //입력을 문자열으로 가져온다
        System.out.println("입력한 문자열 " + str);

        System.out.print("정수를 입력하세요");
        int a = scanner.nextInt(); //입력을 정수로 가져온다.
        System.out.println("입력한 정수 " + a);

        System.out.print("실수를 입력하세요");
        double b = scanner.nextDouble(); //입력을 실수로 가져온다.
        System.out.println("입력한 실수 " + b);
     }
    }

# Scanner시 주의
 ### 입력할 때 숫자 타입에 문자타입 넣으면 오류발생
 ### 즉, 타입이 같아야함.
### Scanner.nextInt()는 숫자만 가져가고 내가 누른 엔터는 가져가지 않는다<br> 그렇기 때문에 다음 Scanner.nextLine때 엔터가 입력되어 입력을 하지 못한다.<br> 방지하기위해 Scanner.nextLine을 중간에 한 번 더 넣는다.

# while안에 Scanner
 ### while((input = scanner.nextInt()) !=-1)처럼 scanner로 입력을 하고 조건을 비교할 수 있다.

