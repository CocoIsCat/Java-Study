public class JavaString {

    public static void main(String[] args) {
        String str1 = "Coco is cat";
        String str2 = "Coco is cute";

        System.out.println(str1);    //Coco is cat 출력

        /*자주 쓰는 메소드*/

        //boolean equals(Obect obj) : 두 문자열이 같은지 체크
        System.out.println(str1.equals(str2));  //false 출력

        //int length() : 문자열의 길이를 알려줌
        System.out.println(str1.length());  // 11 출력

        //int indexOf(String str) : 문자열에서 특정 문자열이 시작되는 위치 리턴
        System.out.println(str1.indexOf("cat"));    //8 출력

        //boolean contains(CharSequence s) : 문자열에 특정 문자열이 포함되어 있는지 여부 리턴
        System.out.println(str2.contains("cute"));  //true 출력

        //char charAt(int index) : 문자열에서 특정 위치의 문자 리턴
        System.out.println(str2.charAt(6)); //"s" 출력

        //String replace(CharSequence old, CharSequence new) : 문자열 중 특정 문자열을 다른 문자열로 바꾸고자 할 떄 사용
        System.out.println(str1.replaceAll("cat", "dog"));  //Coco is dog 출력

        //String substring(int begin, int end) : 문자열 중 특정 부분을 뽑아낼 때 사용
        System.out.println(str2.substring(8, 12));  //cute 출력



        /*문자열 포매팅 : String.format()*/

        //출력 형식 지정
        System.out.println(String.format("%10s", "1234")); //______1234 출력
        System.out.println(String.format("%-10s", "1234")); //1234______ 출력

        //소수점 자리수 지정
        System.out.println(String.format("%.2f", 3.141592));    //3.14 출력
    }
}