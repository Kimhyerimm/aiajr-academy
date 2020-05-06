package hw;

import java.util.HashMap;
import java.util.Map;

//상품
class Goods {
int goodsNo; // 상품코드
String gName; // 상품명
int danga; // 단가

public int getGoodsNo() {
return goodsNo;
}

public String getgName() {
return gName;
}

public int getDanga() {
return danga;
}

Goods(int goodsNo, String gName, int danga) {
this.goodsNo = goodsNo;
this.gName = gName;
this.danga = danga;
}

// 상품리스트 출력할 메서드
public String toString() {
return getGoodsNo()+"\t"+getgName()+"\t"+getDanga();
}
}

//장바구니
class Cart {
int count; // 수량
int total; // 합계
Goods goods;

Cart(){

}
Cart(Goods goods, int count) {
this.goods = goods;
this.count = count;
this.total = (int) (goods.danga * count); // 합계= 상품의단가 * 수량
}

public int getCount() {
return count;
}

public int getTotal() {
return total;
}

public Goods getGoods() {
return goods;
}

// 장바구니 출력할 메서드
public String toString(){
return  goods.goodsNo+"\t"+ goods.gName+"\t"+goods.danga+"\t"+ getCount()+"\t"+getTotal();
}

//상품코드가 1001인 상품의 수량을 5로 변경하는 메소드
String changeCartNo(int goodsNo){
this.goods = goods;

if(goods.goodsNo==1001){
count=5;
}
return  goods.goodsNo+"\t"+ goods.gName+"\t"+goods.danga+"\t"+ getCount()+"\t"+getTotal();
}

//상품코드 1002인 상품 삭제하기
String delete(int goodsNo){
this.goods = goods;

if(goods.goodsNo==1002){
System.out.println("\n[해당 상품 품절]\n");
System.out.println("---------------------------------------");

}
return  goods.goodsNo+"\t"+ goods.gName+"\t"+goods.danga+"\t"+ getCount()+"\t"+getTotal();

}

}

public class CartTest {

static Map<String, Goods> map = new HashMap<String, Goods>(); //Map <Key값, Value값>
static Map<String, Cart> cmap = new HashMap<String, Cart>(); //static 붙여야 아래서 .해서 쓸 수 있음
public static void main(String[] args) {

////상품리스트 프린트
System.out.println("[상품리스트]\n\n상품코드\t상품명\t단가");
System.out.println("---------------------------------------");
Goods good1 = new Goods(1001,"볼펜",1000);
Goods good2 = new Goods(1002,"연필",500);
Goods good3 = new Goods(1003,"딸기",6000);

map.put("1001", good1); //코드를 Key값으로 넣어줬고 Value값을 내용으로 삽입.
map.put("1002", good2);
map.put("1003", good3);

for(Map.Entry<String, Goods> entry : map.entrySet()){ //개선된 for구문. entry에 모두 넘겨 담음
Goods goo = entry.getValue(); //entry에 담은 것을 변수 goo에 담음.
System.out.println(goo.toString()); //만들어둔 toString 함수 출력.
}

////장바구니 프린트
System.out.println("\n\n[장바구니]\n\n상품코드\t상품명\t단가\t수량\t합계\t");
System.out.println("---------------------------------------");
Cart cart1 = new Cart(good1, 2);
Cart cart2 = new Cart(good2, 3);
Cart cart3 = new Cart(good3, 2); //생성자에 입력한 (Goods클래스형 변수, 수량)

cmap.put("1001", cart1);
cmap.put("1002", cart2);
cmap.put("1003", cart3);

for(Map.Entry<String, Cart> entry : cmap.entrySet()){
Cart cart = entry.getValue();
System.out.println(cart.toString());
}
//상품코드가 1001이면 수량을 5로 변경한다.
System.out.println("\n[상품코드 1001의 상품수량 5로 변경]\n");
System.out.println("---------------------------------------");
System.out.println(cart1.changeCartNo(1001));

//삭제
map.remove(1002);
System.out.println(cart2.delete(1002));
}
}


