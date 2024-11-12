public class DomainExtractor {

    public static String extractDomainSuffix(String email) {
        // Find the last dot in the email to extract the suffix
        int lastDotIndex = email.lastIndexOf('.');
        
        // If a dot is found, extract the suffix and check if it's .com, .pk, or .co
        if (lastDotIndex != -1) {
            String suffix = email.substring(lastDotIndex + 1);
            if (suffix.equals("com") || suffix.equals("pk") || suffix.equals("co")) {
                return suffix;
            }
            else{
                return "Worng Inputed Email";
            }
        }
        
        return null; // Return null if no matching suffix is found
    }

    public static void main(String[] args) {
        String email1 = "example@example.com";
        String email2 = "test@example.pk";
        String email3 = "hello@website.co";
        String email4 = "info@anotherdomain.org";

        System.out.println("Domain suffix of email1: " + extractDomainSuffix(email1)); // Output: com
        System.out.println("Domain suffix of email2: " + extractDomainSuffix(email2)); // Output: pk
        System.out.println("Domain suffix of email3: " + extractDomainSuffix(email3)); // Output: co
        System.out.println("Domain suffix of email4: " + extractDomainSuffix(email4)); // Output: null
    }
}
