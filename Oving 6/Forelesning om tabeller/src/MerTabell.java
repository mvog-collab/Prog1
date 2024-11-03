public class MerTabell {

    /*Normalsituasjon: Vi ønsker å verne om egne objektvariabler
    og beskytte disse fra omverdenen. Lag derfor dype kopier av:
            – tabeller som kommer inn som argument og som skal bli
    objektvariabler

     */
    public Rain(int [] rain){
        this.rain = new int[rain.length()];
        for(int i=0; i<rain.length();i++){
            this.rain[i] = rain[i];
        }}
/*– tabeller som er objektvariabler og som sendes ut som returverdi fra
    en metode

 */
    public int[] getRain(){
        int[] tab = new int[rain.length()];
        for(int i=0; i<rain.length();i++){
            tab[i] = rain[i];
        }
        return tab; }