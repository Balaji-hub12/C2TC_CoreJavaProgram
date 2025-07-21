package day1entity;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setCid(101);
		c1.setCname("Balaji");
		c1.setCity("Puducherry");
		System.out.println("The cid is "+c1.getCid());
		System.out.println("The cname is "+c1.getCname());
		System.out.println("The city is "+c1.getCity());
		System.out.println(c1);
		Customer c2=new Customer();
		c2.setCid(102);
		c2.setCname("Vijay");
		c2.setCity("Chennai");
		System.out.println("The cid is "+c2.getCid());
		System.out.println("The cid is "+c2.getCname());
		System.out.println("The cid is "+c2.getCity());
		System.out.println(c2);
	
	}

}
