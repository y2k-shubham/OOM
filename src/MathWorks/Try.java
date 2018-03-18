/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathWorks;

class T {

    public static void main(String[] args) {
        String s = null;
        try {
            throw (new Exception());
        } catch (Exception e) {
            try {
                try {
                    throw (new Exception());
                } catch (Exception ex) {
                    s += "lc";
                }
                throw (new Exception());
            } catch (Exception x) {
                s += "mc";
            } finally {
                s += "mf";
            }
            System.out.println(s);
        }
    }
}
