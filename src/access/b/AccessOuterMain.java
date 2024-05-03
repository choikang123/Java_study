package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public 호출 가능
        data.publicField=1;
        data.publicMethod();
        // default 호출 불가능 같은 패키지가 아니기 때문에
        //data.defaultFiedl =2;
        //data.defaultMethod();

        // private 마찬가지

        // 내부 함수
        data.innerAccess();
    }
}
