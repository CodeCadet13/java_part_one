class Sound {
    public static void main(String[] args) {
        Sound phoneTest = new Sound();
        phoneTest.inputPhoneNumber("4439836909");
    }

    public void inputPhoneNumber(String phoneNumber){
        if(checkPhoneNumber(phoneNumber)==true) {
            System.out.println(phoneNumber + " is a valid phone number.");
        } else {
            System.out.println(phoneNumber + " is not a valid phone number.");
        }

    }

    protected Boolean checkPhoneNumber(String phoneNumber){
        if (phoneNumber.length()==10) {
            return true;
        } else {
            return false;
        }
    }
}