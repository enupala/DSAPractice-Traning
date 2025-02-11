package catchITProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class NormalizedEmails {
    public static void main(String[] args) {
        List<String> emails= Arrays.asList( "test.email+alex@gmail.com",
                                            "test.e.mail+bob.cathy@gmail.com",
                                            "testemail@gmail.com",
                                            "testemail+david@lee.tcode.com");
        int uniqueCountOfEmails=normaliseEmails(emails);
        System.out.println(uniqueCountOfEmails);
    }

    private static int normaliseEmails(List<String> emails) {
        HashSet<String>set=new HashSet<>();
        for(String email:emails)
        {
            String []parts=email.split("@");
            String front=parts[0].split("\\+")[0];
            front=front.replace(".","");
            String normalisedEmail=front+"@"+parts[1];
            set.add(normalisedEmail);

        }
        System.out.println(set);
        return set.size();
    }
}
