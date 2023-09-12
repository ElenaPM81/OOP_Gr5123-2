package Classes;
/*
 * PromotionClient является наследником класса  Actor
 * 
 * 
 */
public class PromotionClient extends Actor  {
    private int idProm;
    private String promotion;
    private static int numPartProm;
    static int maxNumPartProm;
    static{
        numPartProm = 0;  //счетчик участников акции
        maxNumPartProm = 5;  //максимальное количество участников акции 
    }
    /*
     * name является наследием из класса Actor
     * promotion, id новые параметры добавленные к классу
     */
     
    public PromotionClient(String name,String promotion, int id) {
    /*
     * создаем конструктор
     */
        super(name);
        this.promotion = promotion;
        this.idProm = id;
        numPartProm++;
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

    public int getIdProm() {
        return idProm;
    }
    public void setIdProm(int idProm) {
        this.idProm = idProm;
    }

    public String getPromotionName() {
        return promotion;
    }

    public void setPromotionName(String promotion) {
        this.promotion = promotion;
    }


    public int getNumberOfParticipantsInThePromotion() {
        return numPartProm;
    }


  
    public void setNumberOfParticipantsInThePromotion(int numPartProm) {
        PromotionClient.numPartProm = numPartProm;
       
    }
    @Override
    public String getName() {
        return super.name;        
    }

    @Override
    public void setName(String name) {
       super.name = name;        
    }
    public boolean isreturnOrder( ){
        return super.isreturnOrder;
    }
    public void isreturnOrder(boolean returnOrder){
        super.isreturnOrder = returnOrder;
    }

    @Override
    public void returnOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnOrder'");
    }
}
   
  


    


