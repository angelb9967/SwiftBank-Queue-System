package swift.bank.qms;

public class SwiftBankQMS {

    private static String selected_transaction;
    private static String method_transaction;
    private static String transaction_number;
    private static String typeOfUser;
    private static String counterNum;
    private static String id;
    private static String time;
    private static String what = "";

    // These variables will temporarily store or hold the data before the user reviews 
    // and confirms the transaction [before we save to the database]. 
    // To not lose the data while changing frames 
    private static String temp_accNum = "N/A";
    private static String temp_accName = "N/A";
    private static String temp_depRef = "N/A";
    private static String temp_checkN = "N/A";
    private static String temp_biller = "N/A";
    private static String temp_amount = "N/A";
    private static String temp_expDte = "N/A";

    public static void main(String[] args) {
        cstmer_start start = new cstmer_start();
        start.setVisible(true);
    }

    public static String getSelected_transaction() {
        return selected_transaction;
    }

    public static void setSelected_transaction(String aSelected_transaction) {
        selected_transaction = aSelected_transaction;
    }

    public static String getMethod_transaction() {
        return method_transaction;
    }

    public static void setMethod_transaction(String aMethod_transaction) {
        method_transaction = aMethod_transaction;
    }

    public static String getTypeOfUser() {
        return typeOfUser;
    }

    public static void setTypeOfUser(String aTypeOfUser) {
        typeOfUser = aTypeOfUser;
    }

    public static String getTransaction_number() {
        return transaction_number;
    }

    public static void setTransaction_number(String aTransaction_number) {
        transaction_number = aTransaction_number;
    }

    public static String getTemp_accNum() {
        return temp_accNum;
    }

    public static void setTemp_accNum(String aTemp_accNum) {
        temp_accNum = aTemp_accNum;
    }

    public static String getTemp_accName() {
        return temp_accName;
    }

    public static void setTemp_accName(String aTemp_accName) {
        temp_accName = aTemp_accName;
    }

    public static String getTemp_depRef() {
        return temp_depRef;
    }

    public static void setTemp_depRef(String aTemp_depRef) {
        temp_depRef = aTemp_depRef;
    }

    public static String getTemp_checkN() {
        return temp_checkN;
    }

    public static void setTemp_checkN(String aTemp_checkN) {
        temp_checkN = aTemp_checkN;
    }

    public static String getTemp_biller() {
        return temp_biller;
    }

    public static void setTemp_biller(String aTemp_biller) {
        temp_biller = aTemp_biller;
    }

    public static String getTemp_amount() {
        return temp_amount;
    }

    public static void setTemp_amount(String aTemp_amount) {
        temp_amount = aTemp_amount;
    }

    public static String getTemp_expDte() {
        return temp_expDte;
    }

    public static void setTemp_expDte(String aTemp_expDte) {
        temp_expDte = aTemp_expDte;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String aId) {
        id = aId;
    }

    public static String getTime() {
        return time;
    }

    public static void setTime(String aTime) {
        time = aTime;
    }

    public static String getWhat() {
        return what;
    }

    public static void setWhat(String aWhat) {
        what = aWhat;
    }

    public static String getCounterNum() {
        return counterNum;
    }

    public static void setCounterNum(String aCounterNum) {
        counterNum = aCounterNum;
    }
}
