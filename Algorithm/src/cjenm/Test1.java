package cjenm;

public class Test1 {

	public static void main(String[] args) {
		// String url =  "http://www.cjoshopping.com?abc=123&bcd=342";
		// String[] keys = { "abc", "efg"};
		
		// String st = "http://www.shopping.com?abc=123&bvc=345&abc=122";
		String keys[] = {"abc","qwe"};
		// ===> http://www.shopping.com?abc=123&abc=122
		String url = "http://www.ohshopping.com?abc=123&bcd=456&asd=122";
		String sarr[] = url.split("\\?");
		String domain = sarr[0];
		System.out.println(sarr[1]);
		for (String s : keys){
			String[] str = sarr[1].split("&");
			for (int i = 0; i < sarr.length; i++) {
				if(str[i].contains(s)) {
					System.out.println(str[i]);
				}
			}
		}
		
	}

}
