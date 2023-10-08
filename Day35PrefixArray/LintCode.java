int[] result = new int[length];
        
        for(int i = 0 ; i < updates.length ; i++){
            int st = updates[i][0];
            int end = updates[i][1];
            int incr = updates[i][2];
            result[st] += incr;
            
            if(end + 1 < length){
                result[end + 1] -= incr;
            }
        }

        int[] psum = new int[length];
        psum[0] = result[0];
        for(int i = 1 ; i < length ; i++){
            psum[i] = psum[i-1] + result[i]; 
        }
        
        return psum;
