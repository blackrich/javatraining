package learning;

class SuperObject {
    public void paint(){
        draw();
    }
 
    public void draw(){
        draw();
        System.out.println("Super Object");
    }
}
 
 
class SubObject extends SuperObject {
    public void paint(){
        super.draw();
    }
 
    public void draw(){
        System.out.println("Sub Object");
    }
}
 
 
public class heritage{
    public static void main(String[] args){
        SuperObject a = new SubObject();
        a.paint();
    } 
}

// SuperObject 클래스는 paint()와 draw() 메소드를 가지고 있습니다. 
// paint() 메소드는 draw() 메소드를 호출하고, draw() 메소드는 "Super Object"를 출력합니다.
//
// SubObject 클래스는 SuperObject 클래스를 상속받습니다. 
// paint() 메소드는 super.draw()를 호출하여 SuperObject의 draw() 메소드를 실행합니다. draw() 메소드는 "Sub Object"를 출력합니다.
//
// heritage 클래스에서 SuperObject 타입의 변수 a를 생성하고, SubObject의 인스턴스를 할당합니다. 
// 이는 다형성의 예시입니다. 변수 a는 SuperObject 타입이지만, 실제로는 SubObject의 인스턴스를 참조하고 있습니다.
//
// a.paint()를 호출하면 다형성에 의해 SubObject 클래스의 paint() 메소드가 실행됩니다. \
// paint() 메소드 내에서 super.draw()가 호출되어 SuperObject의 draw() 메소드가 실행되며, "Super Object"가 출력됩니다.







