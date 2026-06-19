package ch01;

// RuntimeException 을 상속받으면
// 해당 Exception을 메소드에서 throw해도 메소드에 throws를 붙이지 않아도 된다 (Unchecked Exception)
// 하지만 상위 클래스인 Exception을 상속받으면
// 해당 Exception을 메소드에서 throw하면 메소드에 throws를 반드시 붙여야 한다 (checked Exception)
// 아니면 컴파일 에러가 발생한다

//public class LoginFailException extends RuntimeException{
//    public LoginFailException(String message) {
//        super(message);
//    }
//}

public class LoginFailException extends Exception{
    public LoginFailException(String message) {
        super(message);
    }
}
