package com.skillsoft.generics;

public class Product<__Number__1$>{ // Some characters are supported for type parameter name. This is valid

    private String name;
    private __Number__1$ id;
    private __Number__1$ price;
    private __Number__1$ discount;

    public Product(String name,__Number__1$ id, __Number__1$ price, __Number__1$ discount){
            this.name=name;
            this.id=id;
            this.price=price;
            this.discount=discount;
            }

    @Override
    public String toString(){
        return String.format("{name=%s, id=%s, price=%s, discount=%s}",name,id,price,discount);
    }
}

//public class Product<Num@#ber>{ // Not all special characters are supported for type parameter name. This is not valid
//
//private String name;
//private Num@#ber id;
//private Num@#ber price;
//private Num@#ber discount;
//
//public Product(String name,Num@#ber id,Num@#ber price,Num@#ber discount){
//        this.name=name;
//        this.id=id;
//        this.price=price;
//        this.discount=discount;
//        }
//
//@Override
//public String toString(){
//        return String.format("{name=%s, id=%s, price=%s, discount=%s}",name,id,price,discount);
//        }
//}

//public class Product<123Number> { // Using digits at the beginning is not allowed for type parameter name
//
//    private String name;
//    private 123Number id;
//    private 123Number price;
//    private 123Number discount;
//
//    public Product(String name, 123Number id, 123Number price, 123Number discount) {
//        this.name = name;
//        this.id = id;
//        this.price = price;
//        this.discount = discount;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("{name=%s, id=%s, price=%s, discount=%s}", name, id, price, discount);
//    }
//}

//public class Product<CaNBeAnYThinG> { // <CaNBeAnYThinG> is strange, but it is valid
//
//    private String name;
//    private CaNBeAnYThinG id;
//    private CaNBeAnYThinG price;
//    private CaNBeAnYThinG discount;
//
//    public Product(String name, CaNBeAnYThinG id, CaNBeAnYThinG price, CaNBeAnYThinG discount) {
//        this.name = name;
//        this.id = id;
//        this.price = price;
//        this.discount = discount;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("{name=%s, id=%s, price=%s, discount=%s}", name, id, price, discount);
//    }
//}


//public class Product<Number> { // <Number> as a type parameter to be more specific, but it is confusing seems like a Class name
//
//    private String name;
//    private Number id;
//    private Number price;
//    private Number discount;
//
//    public Product(String name, Number id, Number price, Number discount) {
//        this.name = name;
//        this.id = id;
//        this.price = price;
//        this.discount = discount;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("{name=%s, id=%s, price=%s, discount=%s}", name, id, price, discount);
//    }
//}


//public class Product<n> { // Type parameter <n> is hard to read, looks like a variable name
//
//    private String name;
//    private n id;
//    private n price;
//    private n discount;
//
//    public Product(String name, n id, n price, n discount) {
//        this.name = name;
//        this.id = id;
//        this.price = price;
//        this.discount = discount;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("{name=%s, id=%s, price=%s, discount=%s}", name, id, price, discount);
//    }
//}


//public class Product<N> { // <N> Numeric in nature are of type N - the better option to name a type parameter
//
//    private String name;
//    private N id;
//    private N price;
//    private N discount;
//
//    public Product(String name, N id, N price, N discount) {
//        this.name = name;
//        this.id = id;
//        this.price = price;
//        this.discount = discount;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("{name=%s, id=%s, price=%s, discount=%s}", name, id, price, discount);
//    }
//}
