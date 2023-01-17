class Book {
    protected boolean[] flag = new boolean[10];

    protected Double[] user_rating = new Double[10];

    void being_checkedout(int i) {
        if (flag[i])
            flag[i] = false;
    }

    void being_returned(int j) {
        if (!flag[j])
            flag[j] = true;
    }

    void receive_a_rating(int n, int no){
        if ((user_rating[n] + no) / 2 < 10) {
            user_rating[n] = (user_rating[n] + no) / 2;

        } else {
            user_rating[n] = 10d;
        }
    }
}