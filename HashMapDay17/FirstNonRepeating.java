HashMap<Integer,Integer>hm=new HashMap<>();
	    for(int i=0;i<n;i++){
	        if(hm.containsKey(ar[i])==true){
	            int temp=hm.get(arr[i]);
	            hm.put(arr[i],temp+1);
	        }
	        else{
	            hm.put(arr[i],1);
	        }
	    }
	    for(int i=0;i<n;i++){
	        int a=arr[i];
	        int b=k-arr[i];
	        if((a!=b) && (hm.containsKey(b)==true)){
	            return 1;
	        }
	        else if((a==b) && (hm.containsKey(b)==true) && (hm.get(arr[i])>1)){
	            return 1;
	        }
	    }
	    return 0;
