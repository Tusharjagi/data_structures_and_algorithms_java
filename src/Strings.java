void main() {
//    String str = "Tango";
//    String strName = new String("Tushar");

//    System.out.println("Name: " + str);
//    System.out.println("Orignal Name: " + strName);
//
//    System.out.println(str.length());
//    System.out.println(str.charAt(4));

//    String lastName = "Rana";
//    lastName = "bana";
//    System.out.println(lastName);

//    String name1 = "tushar";
//    String name2 = "tushar";
//
//    if (name1.equalsIgnoreCase(name2)) {
//        System.out.println("Both strings are equal");
//    } else {
//        System.out.println("Both string different");
//    }

//    Scanner sc = new Scanner(System.in);
//
//    System.out.println("Enter your name");
//    String str = sc.nextLine();
//    System.out.println("Value: " + str);
//    System.out.println("Enter your name");
//    String str2 = sc.next();
//    System.out.println("Value: " + str2);
//    String str = "  ";
//    System.out.println(str.length());
//    System.out.println(str.isEmpty());
//    System.out.println(str.isBlank());
//
//    String name = "   tango   ";
//    System.out.println(name.length());
//    System.out.println(name.trim().length());
//
//    System.out.println(name.trim().toUpperCase());
//    System.out.println(name.trim().toLowerCase());
//
//    String sentance = "My Name is Tango";
//
//    System.out.println(sentance.substring(3, 7));
//
//    System.out.println(sentance.contains("is"));

//    int number = 413241;
//    String str = String.valueOf(number);
//    System.out.println(number + 4);
//    System.out.println(str + 2);

//    String name = "Tushar jagi is tango";
//    System.out.println(name.startsWith("Tushar"));
//
//    System.out.println(name.endsWith("tango"));

//    String name = "Tushar";
//    char[] crr = name.toCharArray();
//
//    for (char ch: crr) {
//        System.out.println("Value: " + ch);
//    }

//    String str = "My, name, is, tushar";
//    String[] words = str.split(",");
//    for (String st: words) {
//        System.out.println("Results: " + st.trim());
//    }

//    String str = "Tushhhhar";
//    str = str.replace('r', 'l');
//    System.out.println(str);

//    print each string
//    String name = "Tushar";
//
//    int n = name.length();
//
//    for (int i = 0; i < n; i++) {
//        char ch = name.charAt(i);
//        System.out.println(ch);
//    }

//    String str = "tango";
//    char[] arr = str.toCharArray();
//    int len = arr.length;
//    System.out.println(len);
//    String str = "tushar";
//
//    int count = 0;
//    for (int i = 0; i < str.length(); i++) {
//        char ch = str.charAt(i);
//        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//            count++;
//        }
//    }
//    System.out.println(count);

//    String str = "tango";
//
//    String reverse = "";
//
//    int n = str.length();
//    for (int i = n-1; i >=0; i--) {
//        char ch = str.charAt(i);
//        reverse += ch;
//    }
//
//    System.out.println(reverse);

//    String str = "NOON";
//    String reverse = "";
//    int n = str.length();
//    for (int i = n-1; i >=0; i--) {
//        char ch = str.charAt(i);
//        reverse += ch;
//    }
//
//    for (int i = 0; i < str.length(); i++) {
//        char ch1 = str.charAt(i);
//        char ch2 = reverse.charAt(i);
//
//        if (ch1 != ch2) {
//            System.out.println("false");
//        } else {
//            System.out.println("True");
//        }
//
//    }

//    String str = "my, name is tushar jagi";

//    int count = 0;
//
//    for (int i = 0; i < str.length(); i++) {
//        char ch = str.charAt(i);
//        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//            count++;
//        }
//    }
//
//    int counter = 0;
//
//    String[] words = str.split(" ");
//        for (String st: words) {
//        counter++;
//    }
//    System.out.println(counter);

//    upercase without using the method
//
//    String str = "tushar";
//    StringBuilder result = new StringBuilder();
//
//    for (int i = 0; i < str.length(); i++) {
//        char ch = str.charAt(i);
//        if (ch >= 'a' && ch <= 'z') {
//            ch = (char)(ch - 32);
//        }
//        result.append(ch);
//    }
//    System.out.println("Caps: " + result);

//    frequency of the character




}