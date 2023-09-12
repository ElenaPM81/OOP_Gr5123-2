package Classes;

public class OrdinaryClient extends Actor {

  

    public OrdinaryClient(String name) {
        super(name);
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public void setTakeOrder(boolean takenOrder) {
        super.isTakeOrder = takenOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    public Actor getActor()
    {
        return this;
    }
    public boolean isreturnOrder( ){
        return super.isreturnOrder;
    }
    public void isreturnOrder(boolean returnOrder){
        super.isreturnOrder = returnOrder;
    }

    
    @Override
    public String getName() {
        return super.name;        
    }

    @Override
    public void setName(String name) {
       super.name = name;        
    }

    @Override
    public void returnOrder() {
        // TODO Auto-generated method stub
        
    }

   
 
   
}

