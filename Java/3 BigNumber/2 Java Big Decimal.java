        class Val implements Comparable<Val> {
            BigDecimal d;
            String s;
            public int compareTo(Val v) {
                int c = d.compareTo(v.d);
                return -c;
            }
        }

        ArrayList<Val> tree = new ArrayList<Val>();
        
        for(int i = 0; i < n; i++) {
            Val v = new Val();
            v.d = new BigDecimal(s[i]);
            v.s = s[i];
            tree.add(v);  
        }
        Collections.sort(tree);

        int j = 0; 

        for(Val v : tree) { 
            s[j++] = v.s;
        }