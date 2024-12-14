import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class nRequest {
  public static void main(String[] args) {
    String[] requests = {"a","b","c","a","c"};
    int k = 3;
    LinkedHashSet<String> uniqueReq = new LinkedHashSet<>();
    for (int i = requests.length - 1; i >=0; i--) {
      uniqueReq.add(requests[i]);
    }
    String[] ans = new String[Math.min(k, uniqueReq.size())];
    int count = 0 ;
    for (String request : uniqueReq) {
      if (count <= k) {
        ans[count++] = request;
      }
    }

    for (int i = 0; i < ans.length; i++) {
      System.out.println(ans[i]+ " ");
    }
   }
}
