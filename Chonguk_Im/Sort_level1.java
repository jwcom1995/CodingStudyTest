class Solution {    
    
    public int sort(int[] array, int order){
        int temp;
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array.length-(i+1) ; j++){
                if(array[j]>array[j+1]){
                    temp = array[j+1];
                    array[j+1] =  array[j];
                    array[j] = temp;
                }
            }
        }
        return array[order-1];
    }
    
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index;
        int indexA=0;
        int[] temp;
        for(int i = 0 ; i < commands.length;i++){
            temp = new int[commands[i][1]-commands[i][0]+1];
            index=0;
            for(int j = commands[i][0] ; j <= commands[i][1] ;j++){
                temp[index]=array[j-1];
                index++;
            }
            answer[indexA]=this.sort(temp,commands[i][2]);
            indexA++;
        }
        return answer;
    }
   
}
