public class shrineoforder {
    private int str;
    private int fort;
    private int agil;
    private int will;
    private int intel;
    private int isma;
    private int element;
    private int wep;
    private int total1;
    private int checking;

        public shrineoforder(int str, int fort, int agil, int will, int intel, int isma, int element, int wep){
            this.str = str;
            this.fort = fort;
            this.agil = agil;
            this.will = will;
            this.intel = intel;
            this.isma = isma;
            this.wep = wep;
            this.element = element;
            total1 = 0;
            checking = 0;
            //pre shrine set methods to set stats per traits
        }
        public void setstr(int newstr){
            str = newstr;
        }
         public void setfort(int newfort){
            fort = newfort;
        } public void setagil(int newagil){
            agil = newagil;
        }
         public void setintel(int newintel){
            intel = newintel;
        }
         public void setwill(int newwill){
                will = newwill;
        }
         public void setisma(int newisma){
            isma = newisma;
        }
         public void setelement(int newelement){
            element = newelement;
        }

         public void setwep(int newwep){
            wep = newwep;
        }
            //shrine stats

        //check to see if any of these equal zero to see the scaling go down

        public void check(){
            int checker = 8;
                if(str == 0){
                    checker--;
                }
                if(fort == 0){
                    checker--;
                }
                if(agil == 0){
                    checker--;
                }
                if(will == 0){
                    checker--;
                }
                if(intel == 0){
                    checker--;
                }
                if(isma == 0){
                    checker--;
                }
                if(element == 0){
                    checker--;
                }
                 if(wep == 0){
                    checker--;
                 } // FIXED: Closed the if statement brace right here

                this.checking = checker;
                int total = str + fort + agil + will + intel + isma + element + wep; // FIXED: Added missing 'int' type
                if (checker > 0) {
                    total /= checker;
                }
                total1 = total; // FIXED: Swapped the assignment direction to save your math
                checking = checker;
}
            public void shrine(){
                if(str > 75){
                    str = 75;
                }
                else
                        str = total1;
                         if(fort > 75){
                    fort = 75;
                }
                else
                        fort = total1;
                         if(agil > 75){
                    agil = 75;
                }
                else
                        agil = total1;
                         if(intel > 75){
                 intel = 75;
                }
                else
                        intel = total1;
                         if(will > 75){
                    will = 75;
                }
                else
                        will = total1;
                         if(isma > 75){
                    isma = 75;
                }
                else
                        isma = total1;
                         if(element > 75){
                    element = 75;
                }
                else
                        element = total1;
                         if(wep > 75){
                    wep = 75;
                }
                else
                        wep = total1;


            }
            public String toString(){
                    return " new strength -- " + str + "\n"  +
                            " new fortitude -- " + fort + "\n"  +
                            " new agility -- " + agil + "\n"  +
                            " new willpower -- " + will + "\n"  +
                            " new intel -- " + intel + "\n" +
                            " new charisma -- " + isma + "\n" +
                            " new weapon -- " + wep + "\n " +
                            " new element -- " + element + "\n";
                }
}
