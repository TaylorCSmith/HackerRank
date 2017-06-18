    static boolean isAnagram(String a, String b) {
        
        String A = a.toLowerCase();
        String B = b.toLowerCase(); 

        char[] aArr = A.toCharArray();
        char[] bArr = B.toCharArray();
 
        Arrays.sort(aArr);
        Arrays.sort(bArr); 
     
        if (aArr.length != bArr.length) {
            return false;
        }
        
        for (int i = 0; i < aArr.length || i < bArr.length; i++) {
            if (aArr[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }