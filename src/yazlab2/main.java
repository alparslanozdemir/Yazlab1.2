/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yazlab2;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alpar
 */
public class main {

    public static Random random = new Random();
    public static int zeminkat = 0;
    public static boolean asansor1yon = true;
    public static boolean asansor2yon = true;
    public static boolean asansor3yon = true;
    public static boolean asansor4yon = true;
    public static boolean asansor5yon = true;
    public static boolean asansor2run = false;
    public static boolean asansor3run = false;
    public static boolean asansor4run = false;
    public static boolean asansor5run = false;
    public static int asansor1kat = 1;
    public static int asansor2kat = 1;
    public static int asansor3kat = 1;
    public static int asansor4kat = 1;
    public static int asansor5kat = 1;
    public static int kat2insan = 0;
    public static int kat3insan = 0;
    public static int kat4insan = 0;
    public static int kat5insan = 0;
    public static int asansor1yolcu = 0;
    public static int asansor2yolcu = 0;
    public static int asansor3yolcu = 0;
    public static int asansor4yolcu = 0;
    public static int asansor5yolcu = 0;
    public static int[] asansor1yuk = new int[10];
    public static int[] asansor2yuk = new int[10];
    public static int[] asansor3yuk = new int[10];
    public static int[] asansor4yuk = new int[10];
    public static int[] asansor5yuk = new int[10];

    public static ConcurrentLinkedQueue<Integer> kat1kuyruk = new ConcurrentLinkedQueue<>();
    public static ConcurrentLinkedQueue<Integer> kat2kuyruk = new ConcurrentLinkedQueue<>();
    public static ConcurrentLinkedQueue<Integer> kat3kuyruk = new ConcurrentLinkedQueue<>();
    public static ConcurrentLinkedQueue<Integer> kat4kuyruk = new ConcurrentLinkedQueue<>();
    public static ConcurrentLinkedQueue<Integer> kat5kuyruk = new ConcurrentLinkedQueue<>();

    public static Timer timer1 = new Timer();
    public static Timer timer2 = new Timer();
    public static Timer timer3 = new Timer();
    public static TimerTask avmgiris = new TimerTask() {
        @Override
        public void run() {
            System.out.println("BURASI CALISIYOR MUUUUUUUUUUUUUU");
            System.out.println("BURASI CALISIYOR MUUUUUUUUUUUUUU");
            System.out.println("BURASI CALISIYOR MUUUUUUUUUUUUUU");
            System.out.println("BURASI CALISIYOR MUUUUUUUUUUUUUU");
            System.out.println("BURASI CALISIYOR MUUUUUUUUUUUUUU");
            System.out.println("BURASI CALISIYOR MUUUUUUUUUUUUUU");
            System.out.println("BURASI CALISIYOR MUUUUUUUUUUUUUU");
            System.out.println("BURASI CALISIYOR MUUUUUUUUUUUUUU");
            System.out.println("BURASI CALISIYOR MUUUUUUUUUUUUUU");System.out.println("BURASI CALISIYOR MUUUUUUUUUUUUUU");System.out.println("BURASI CALISIYOR MUUUUUUUUUUUUUU");
            
            
            
            int girenmusteri = random.nextInt(10) + 1;
            for (int i = 0; i < girenmusteri; i++) {
                int hedefkat = random.nextInt(4) + 2;
                zeminkat++;
                //System.out.println("avmye 1 kisi girdi. icerdeki kisi: " + zeminkat + " Gitmek istenen kat: " + hedefkat + " asansor kuyruguna eklendi.");
                kat1kuyruk.add(hedefkat);
            }
        }
    };
    public static TimerTask kuyrukkontrol = new TimerTask() {
        @Override
        public void run() {
            int toplamkuyruk = kat1kuyruk.size() + kat2kuyruk.size() + kat3kuyruk.size() + kat4kuyruk.size() + kat5kuyruk.size();
            if (toplamkuyruk < 21 && asansor2run == true) {
                System.out.println("ASANSOR 2 DEVREDISI.....");
                asansor2run = false;
            } else if (toplamkuyruk > 21 && asansor2run == false) {
                System.out.println("ASANSOR 2 AKTIF! Kuyruktaki insan sayisi = " + toplamkuyruk);
                asansor2run = true;
            }
            if (toplamkuyruk < 41 && asansor3run == true) {
                System.out.println("ASANSOR 3 DEVREDISI.....");
                asansor3run = false;
            } else if (toplamkuyruk > 41 && asansor3run == false) {
                System.out.println("ASANSOR 3 AKTIF! Kuyruktaki insan sayisi = " + toplamkuyruk);
                asansor3run = true;
            }
            if (toplamkuyruk < 61 && asansor3run == true) {
                System.out.println("ASANSOR 4 DEVREDISI.....");
                asansor3run = false;
            } else if (toplamkuyruk > 61 && asansor4run == false) {
                System.out.println("ASANSOR 4 AKTIF! Kuyruktaki insan sayisi = " + toplamkuyruk);
                asansor4run = true;
            }
            if (toplamkuyruk < 81 && asansor5run == true) {
                System.out.println("ASANSOR 5 DEVREDISI.....");
                asansor5run = false;
            } else if (toplamkuyruk > 81 && asansor5run == false) {
                System.out.println("ASANSOR 5 AKTIF! Kuyruktaki insan sayisi = " + toplamkuyruk);
                asansor5run = true;
            }
        }
    };
    public static TimerTask avmcikis = new TimerTask() {
        @Override
        public void run() {
            int cikanmusteri = random.nextInt(5) + 1;
            for (int i = 0; i < cikanmusteri; i++) {
                int hedefkat = random.nextInt(4) + 2;
                if (kat2insan + kat3insan + kat4insan + kat5insan < cikanmusteri) {
                    break;
                } else if (hedefkat == 2) {
                    if (kat2insan == 0) {
                        System.out.println("----kat 2'de insan yok. Kuyruga alinmadi.");
                        i--;
                        continue;
                    }
                    System.out.println("----Kat2'ten 1 kisi kuyruga alindi.");
                    kat2insan--;
                    kat2kuyruk.add(1);
                } else if (hedefkat == 3) {
                    if (kat3insan == 0) {
                        System.out.println("----kat 3'de insan yok. Kuyruga alinmadi.");
                        i--;
                        continue;
                    }
                    System.out.println("----Kat3'den 1 kisi kuyruga alindi.");
                    kat3insan--;
                    kat3kuyruk.add(1);
                } else if (hedefkat == 4) {
                    if (kat4insan == 0) {
                        System.out.println("----kat 4'de insan yok. Kuyruga alinmadi.");
                        i--;
                        continue;
                    }
                    System.out.println("----Kat4'ten 1 kisi kuyruga alindi.");
                    kat4insan--;
                    kat5kuyruk.add(1);
                } else if (hedefkat == 5) {
                    if (kat5insan == 0) {
                        System.out.println("----kat 5'de insan yok. Kuyruga alinmadi.");
                        i--;
                        continue;
                    }
                    System.out.println("----Kat5'ten 1 kisi kuyruga alindi.");
                    kat5insan--;
                    kat5kuyruk.add(1);
                }
            }
        }
    };

    public static Thread asansor1 = new Thread() {
        @Override
        public void run() {
            while (true) {
                if (asansor1kat == 1) {
                    System.out.println("Asansor1: asansor kat 1 de.");
                    asansor1yon = true;
                    System.out.println("Asansor1: Zemin katta cikan kisi sayisi: " + asansor1yolcu);
                    asansor1yolcu = 0;
                    for (int i = 0; i < 10; i++) {
                        asansor1yuk[i] = 0;
                    }
                    System.out.println("Asansor1: Yeni yolcular zemin kattan Asansore aliniyor...");
                    if (kat1kuyruk.size() > 10) {
                        for (int i = 0; i < 10; i++) {
                            asansor1yuk[i] = kat1kuyruk.poll();
                            asansor1yolcu++;
                            System.out.println("Asansor1: alinanlar= " + asansor1yuk[i]);
                        }
                    } else if (kat1kuyruk.size() > 0) {
                        for (int i = 0; i < kat1kuyruk.size(); i++) {
                            asansor1yuk[i] = kat1kuyruk.poll();
                            asansor1yolcu++;
                            System.out.println("Asansor1: alinanlar= " + asansor1yuk[i]);
                        }
                    }
                    int enkucukkat = 5;
                    for (int i = 0; i < 10; i++) {
                        if (asansor1yuk[i] < enkucukkat) {
                            if (asansor1yuk[i] > 0) {
                                enkucukkat = asansor1yuk[i];
                            }
                        }
                        asansor1kat = enkucukkat;
                    }
                }
                if (asansor1kat == 2) {
                    System.out.println("Asansor1: asansor kat 2 de.");
                    if (asansor1yon == true) {
                        System.out.println("Asansor1: asansor dagitimda.");
                        for (int i = 0; i < 10; i++) {
                            if (asansor1yuk[i] == 2) {
                                System.out.println("Asansor1: kat2 de yolcu indirildi.");
                                asansor1yuk[i] = 0;
                                asansor1yolcu--;
                                kat3insan++;
                            }
                        }

                        if (asansor1yolcu == 0) {
                            System.out.println("Asansor1: yolcu kalmadi. 2. kattan itibaren toplama modu aktif.");
                            if (kat5kuyruk.size() > 0) {
                                asansor1kat = 5;
                            } else if (kat4kuyruk.size() > 0) {
                                asansor1kat = 4;
                            } else if (kat3kuyruk.size() > 0) {
                                asansor1kat = 3;
                            }
                            asansor1yon = false;
                        } else {
                            System.out.println("Asansor1: kat2 de yolcu indirme islemi basariyla tamamlandi. sonraki kata gidiliyor.");
                            int enkucukkat = 5;
                            for (int i = 0; i < 10; i++) {
                                if (asansor1yuk[i] < enkucukkat) {
                                    if (asansor1yuk[i] > 0) {
                                        enkucukkat = asansor1yuk[i];
                                    }
                                }
                                asansor1kat = enkucukkat;
                            }
                        }
                    } else {
                        if (asansor1yolcu < 10) {
                            for (int i = 0; i < 10; i++) {
                                if (asansor1yuk[i] == 0 && !kat2kuyruk.isEmpty()) {
                                    Integer a = kat2kuyruk.poll();
                                    if (a != null) {
                                        asansor1yuk[i] = a;
                                        asansor1yolcu++;
                                        System.out.println("Asansor1: 2. kattaki bir yolcu alindi.");
                                    }
                                }
                            }
                        }
                        asansor1kat = 1;
                    }
                }
                if (asansor1kat == 3) {
                    System.out.println("Asansor1: asansor kat 3 de.");
                    if (asansor1yon == true) {
                        System.out.println("Asansor1: asansor dagitimda.");
                        for (int i = 0; i < 10; i++) {
                            if (asansor1yuk[i] == 3) {
                                System.out.println("Asansor1: kat3 de yolcu indirildi.");
                                asansor1yuk[i] = 0;
                                asansor1yolcu--;
                                kat4insan++;
                            }
                        }

                        if (asansor1yolcu == 0) {
                            System.out.println("Asansor1: yolcu kalmadi. 3. kattan itibaren toplama modu aktif.");
                            if (kat5kuyruk.size() > 0) {
                                asansor1kat = 5;
                            } else if (kat4kuyruk.size() > 0) {
                                asansor1kat = 4;
                            }
                            asansor1yon = false;
                        } else {
                            System.out.println("Asansor1: kat3 de yolcu indirme islemi basariyla tamamlandi. sonraki kata gidiliyor.");
                            int enkucukkat = 5;
                            for (int i = 0; i < 10; i++) {
                                if (asansor1yuk[i] < enkucukkat) {
                                    if (asansor1yuk[i] > 0) {
                                        enkucukkat = asansor1yuk[i];
                                    }
                                }
                                asansor1kat = enkucukkat;
                            }
                        }
                    } else {
                        if (asansor1yolcu < 10) {
                            for (int i = 0; i < 10; i++) {
                                if (asansor1yuk[i] == 0 && !kat3kuyruk.isEmpty()) {
                                    Integer a = kat3kuyruk.poll();
                                    if (a != null) {
                                        asansor1yuk[i] = a;
                                        asansor1yolcu++;
                                        System.out.println("Asansor1: 3. kattaki bir yolcu alindi.");
                                    }
                                }
                            }
                        }
                        asansor1kat = 2;
                    }
                }
                if (asansor1kat == 4) {
                    System.out.println("Asansor1: asansor kat 4 de.");
                    if (asansor1yon == true) {
                        System.out.println("Asansor1: asansor dagitimda.");
                        for (int i = 0; i < 10; i++) {
                            if (asansor1yuk[i] == 4) {
                                System.out.println("Asansor1: kat4 de yolcu indirildi.");
                                asansor1yuk[i] = 0;
                                asansor1yolcu--;
                                kat5insan++;
                            }
                        }

                        if (asansor1yolcu == 0) {
                            System.out.println("Asansor1: yolcu kalmadi. 4. kattan itibaren toplama modu aktif.");
                            if (kat5kuyruk.size() > 0) {
                                asansor1kat = 5;
                            }
                            asansor1yon = false;
                        } else {
                            System.out.println("Asansor1: kat4 de yolcu indirme islemi basariyla tamamlandi. sonraki kata gidiliyor.");
                            int enkucukkat = 5;
                            for (int i = 0; i < 10; i++) {
                                if (asansor1yuk[i] < enkucukkat) {
                                    if (asansor1yuk[i] > 0) {
                                        enkucukkat = asansor1yuk[i];
                                    }
                                }
                                asansor1kat = enkucukkat;
                            }
                        }
                    } else {
                        if (asansor1yolcu < 10) {
                            for (int i = 0; i < 10; i++) {
                                if (asansor1yuk[i] == 0 && !kat4kuyruk.isEmpty()) {
                                    Integer a = kat4kuyruk.poll();
                                    if (a != null) {
                                        asansor1yuk[i] = a;
                                        asansor1yolcu++;
                                        System.out.println("Asansor1: 4. kattaki bir yolcu alindi.");
                                    }
                                }
                            }
                        }
                        asansor1kat = 3;
                    }
                }
                if (asansor1kat == 5) {
                    System.out.println("Asansor1: asansor kat 5 de.");
                    if (asansor1yon == true) {
                        System.out.println("Asansor1: asansor dagitimda.");
                        for (int i = 0; i < 10; i++) {
                            if (asansor1yuk[i] == 5) {
                                System.out.println("Asansor1: kat5 de yolcu indirildi.");
                                asansor1yuk[i] = 0;
                                asansor1yolcu--;
                                kat5insan++;
                            }
                        }
                        System.out.println("Asansor1: kat5 de yolcu indirme islemi basariyla tamamlandi. sonraki kata gidiliyor.");

                        if (asansor1yolcu == 0) {
                            System.out.println("Asansor1: yolcu kalmadi. 5. kattan itibaren toplama modu aktif.");
                            asansor1yon = false;
                        }
                    } else {
                        if (asansor1yolcu < 10) {
                            for (int i = 0; i < 10; i++) {
                                if (asansor1yuk[i] == 0 && !kat5kuyruk.isEmpty()) {
                                    Integer a = kat5kuyruk.poll();
                                    if (a != null) {
                                        asansor1yuk[i] = a;
                                        asansor1yolcu++;
                                        System.out.println("Asansor1: 5. kattaki bir yolcu alindi.");
                                    }
                                }
                            }
                        }
                        asansor1kat = 4;
                    }
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    };

    public static Thread asansor2 = new Thread() {
        @Override
        public void run() {
            while (true) {
                while (asansor2run == true || asansor2kat != 1) {
                    if (asansor2kat == 1) {
                        System.out.println("Asansor2: kat 1 de.");
                        asansor2yon = true;
                        System.out.println("Asansor2: Zemin katta cikan kisi sayisi: " + asansor2yolcu);
                        asansor2yolcu = 0;
                        for (int i = 0; i < 10; i++) {
                            asansor2yuk[i] = 0;
                        }
                        System.out.println("Asansor2: Yeni yolcular zemin kattan Asansore aliniyor...");
                        if (kat1kuyruk.size() > 10) {
                            for (int i = 0; i < 10; i++) {
                                asansor2yuk[i] = kat1kuyruk.poll();
                                asansor2yolcu++;
                                System.out.println("Asansor2: alinanlar= " + asansor2yuk[i]);
                            }
                        } else if (kat1kuyruk.size() > 0) {
                            for (int i = 0; i < kat1kuyruk.size(); i++) {
                                asansor2yuk[i] = kat1kuyruk.poll();
                                asansor2yolcu++;
                                System.out.println("Asansor2: alinanlar= " + asansor2yuk[i]);
                            }
                        }
                        int enkucukkat = 5;
                        for (int i = 0; i < 10; i++) {
                            if (asansor2yuk[i] < enkucukkat) {
                                if (asansor2yuk[i] > 0) {
                                    enkucukkat = asansor2yuk[i];
                                }
                            }
                            asansor2kat = enkucukkat;
                        }
                    }
                    if (asansor2kat == 2) {
                        System.out.println("Asansor2: asansor2 kat 2 de.");
                        if (asansor2yon == true) {
                            System.out.println("Asansor2: asansor2 dagitimda.");
                            for (int i = 0; i < 10; i++) {
                                if (asansor2yuk[i] == 2) {
                                    System.out.println("Asansor2: kat2 de yolcu indirildi.");
                                    asansor2yuk[i] = 0;
                                    asansor2yolcu--;
                                    kat3insan++;
                                }
                            }

                            if (asansor2yolcu == 0) {
                                System.out.println("Asansor2: yolcu kalmadi. 2. kattan itibaren toplama modu aktif.");
                                if (kat5kuyruk.size() > 0) {
                                    asansor2kat = 5;
                                } else if (kat4kuyruk.size() > 0) {
                                    asansor2kat = 4;
                                } else if (kat3kuyruk.size() > 0) {
                                    asansor2kat = 3;
                                }
                                asansor2yon = false;
                            } else {
                                System.out.println("Asansor2: kat2 de yolcu indirme islemi basariyla tamamlandi. sonraki kata gidiliyor.");
                                int enkucukkat = 5;
                                for (int i = 0; i < 10; i++) {
                                    if (asansor2yuk[i] < enkucukkat) {
                                        if (asansor2yuk[i] > 0) {
                                            enkucukkat = asansor2yuk[i];
                                        }
                                    }
                                    asansor2kat = enkucukkat;
                                }
                            }
                        } else {
                            if (asansor2yolcu < 10) {
                                for (int i = 0; i < 10; i++) {
                                    if (asansor2yuk[i] == 0 && !kat2kuyruk.isEmpty()) {
                                        Integer a = kat2kuyruk.poll();
                                        if (a != null) {
                                            asansor2yuk[i] = a;
                                            asansor2yolcu++;
                                            System.out.println("Asansor2: 2. kattaki bir yolcu alindi.");
                                        }
                                    }
                                }
                            }
                            asansor2kat = 1;
                        }
                    }
                    if (asansor2kat == 3) {
                        System.out.println("Asansor2: kat 3 de.");
                        if (asansor2yon == true) {
                            System.out.println("Asansor2: dagitimda.");
                            for (int i = 0; i < 10; i++) {
                                if (asansor2yuk[i] == 3) {
                                    System.out.println("Asansor2: kat3 de yolcu indirildi.");
                                    asansor2yuk[i] = 0;
                                    asansor2yolcu--;
                                    kat4insan++;
                                }
                            }

                            if (asansor2yolcu == 0) {
                                System.out.println("Asansor2: yolcu kalmadi. 3. kattan itibaren toplama modu aktif.");
                                if (kat5kuyruk.size() > 0) {
                                    asansor2kat = 5;
                                } else if (kat4kuyruk.size() > 0) {
                                    asansor2kat = 4;
                                }
                                asansor2yon = false;
                            } else {
                                System.out.println("Asansor2: kat3 de yolcu indirme islemi basariyla tamamlandi. sonraki kata gidiliyor.");
                                int enkucukkat = 5;
                                for (int i = 0; i < 10; i++) {
                                    if (asansor2yuk[i] < enkucukkat) {
                                        if (asansor2yuk[i] > 0) {
                                            enkucukkat = asansor2yuk[i];
                                        }
                                    }
                                    asansor2kat = enkucukkat;
                                }
                            }
                        } else {
                            if (asansor2yolcu < 10) {
                                for (int i = 0; i < 10; i++) {
                                    if (asansor2yuk[i] == 0 && !kat3kuyruk.isEmpty()) {
                                        Integer a = kat3kuyruk.poll();
                                        if (a != null) {
                                            asansor2yuk[i] = a;
                                            asansor2yolcu++;
                                            System.out.println("Asansor2: 3. kattaki bir yolcu alindi.");
                                        }
                                    }
                                }
                            }
                            asansor2kat = 2;
                        }
                    }
                    if (asansor2kat == 4) {
                        System.out.println("Asansor2: asansor2 kat 4 de.");
                        if (asansor2yon == true) {
                            System.out.println("Asansor2: asansor2 dagitimda.");
                            for (int i = 0; i < 10; i++) {
                                if (asansor2yuk[i] == 4) {
                                    System.out.println("Asansor2: kat4 de yolcu indirildi.");
                                    asansor2yuk[i] = 0;
                                    asansor2yolcu--;
                                    kat5insan++;
                                }
                            }

                            if (asansor2yolcu == 0) {
                                System.out.println("Asansor2: yolcu kalmadi. 4. kattan itibaren toplama modu aktif.");
                                if (kat5kuyruk.size() > 0) {
                                    asansor2kat = 5;
                                }
                                asansor2yon = false;
                            } else {
                                System.out.println("Asansor2: kat4 de yolcu indirme islemi basariyla tamamlandi. sonraki kata gidiliyor.");
                                int enkucukkat = 5;
                                for (int i = 0; i < 10; i++) {
                                    if (asansor2yuk[i] < enkucukkat) {
                                        if (asansor2yuk[i] > 0) {
                                            enkucukkat = asansor2yuk[i];
                                        }
                                    }
                                    asansor2kat = enkucukkat;
                                }
                            }
                        } else {
                            if (asansor2yolcu < 10) {
                                for (int i = 0; i < 10; i++) {
                                    if (asansor2yuk[i] == 0 && !kat4kuyruk.isEmpty()) {
                                        Integer a = kat4kuyruk.poll();
                                        if (a != null) {
                                            asansor2yuk[i] = a;
                                            asansor2yolcu++;
                                            System.out.println("Asansor2: 4. kattaki bir yolcu alindi.");
                                        }
                                    }
                                }
                            }
                            asansor2kat = 3;
                        }
                    }
                    if (asansor2kat == 5) {
                        System.out.println("Asansor2: kat 5 de.");
                        if (asansor2yon == true) {
                            System.out.println("Asansor2: dagitimda.");
                            for (int i = 0; i < 10; i++) {
                                if (asansor2yuk[i] == 5) {
                                    System.out.println("Asansor2: kat5 de yolcu indirildi.");
                                    asansor2yuk[i] = 0;
                                    asansor2yolcu--;
                                    kat5insan++;
                                }
                            }
                            System.out.println("Asansor2: kat5 de yolcu indirme islemi basariyla tamamlandi. sonraki kata gidiliyor.");

                            if (asansor2yolcu == 0) {
                                System.out.println("Asansor2: yolcu kalmadi. 5. kattan itibaren toplama modu aktif.");
                                asansor2yon = false;
                            }
                        } else {
                            if (asansor2yolcu < 10) {
                                for (int i = 0; i < 10; i++) {
                                    if (asansor2yuk[i] == 0 && !kat5kuyruk.isEmpty()) {
                                        Integer a = kat5kuyruk.poll();
                                        if (a != null) {
                                            asansor2yuk[i] = a;
                                            asansor2yolcu++;
                                            System.out.println("Asansor2: 5. kattaki bir yolcu alindi.");
                                        }
                                    }
                                }
                            }
                            asansor2kat = 4;
                        }
                    }
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    };
    public static Thread asansor3 = new Thread() {
        @Override
        public void run() {
            while (true) {
                while (asansor3run == true || asansor3kat != 1) {
                    if (asansor3kat == 1) {
                        System.out.println("asansor3: kat 1 de.");
                        asansor3yon = true;
                        System.out.println("asansor3: Zemin katta cikan kisi sayisi: " + asansor3yolcu);
                        asansor3yolcu = 0;
                        for (int i = 0; i < 10; i++) {
                            asansor3yuk[i] = 0;
                        }
                        System.out.println("asansor3: Yeni yolcular zemin kattan Asansore aliniyor...");
                        if (kat1kuyruk.size() > 10) {
                            for (int i = 0; i < 10; i++) {
                                asansor3yuk[i] = kat1kuyruk.poll();
                                asansor3yolcu++;
                                System.out.println("asansor3: alinanlar= " + asansor3yuk[i]);
                            }
                        } else if (kat1kuyruk.size() > 0) {
                            for (int i = 0; i < kat1kuyruk.size(); i++) {
                                asansor3yuk[i] = kat1kuyruk.poll();
                                asansor3yolcu++;
                                System.out.println("asansor3: alinanlar= " + asansor3yuk[i]);
                            }
                        }
                        int enkucukkat = 5;
                        for (int i = 0; i < 10; i++) {
                            if (asansor3yuk[i] < enkucukkat) {
                                if (asansor3yuk[i] > 0) {
                                    enkucukkat = asansor3yuk[i];
                                }
                            }
                            asansor3kat = enkucukkat;
                        }
                    }
                    if (asansor3kat == 2) {
                        System.out.println("asansor3: asansor3 kat 2 de.");
                        if (asansor3yon == true) {
                            System.out.println("asansor3: asansor3 dagitimda.");
                            for (int i = 0; i < 10; i++) {
                                if (asansor3yuk[i] == 2) {
                                    System.out.println("asansor3: kat2 de yolcu indirildi.");
                                    asansor3yuk[i] = 0;
                                    asansor3yolcu--;
                                    kat3insan++;
                                }
                            }

                            if (asansor3yolcu == 0) {
                                System.out.println("asansor3: yolcu kalmadi. 2. kattan itibaren toplama modu aktif.");
                                if (kat5kuyruk.size() > 0) {
                                    asansor3kat = 5;
                                } else if (kat4kuyruk.size() > 0) {
                                    asansor3kat = 4;
                                } else if (kat3kuyruk.size() > 0) {
                                    asansor3kat = 3;
                                }
                                asansor3yon = false;
                            } else {
                                System.out.println("asansor3: kat2 de yolcu indirme islemi basariyla tamamlandi. sonraki kata gidiliyor.");
                                int enkucukkat = 5;
                                for (int i = 0; i < 10; i++) {
                                    if (asansor3yuk[i] < enkucukkat) {
                                        if (asansor3yuk[i] > 0) {
                                            enkucukkat = asansor3yuk[i];
                                        }
                                    }
                                    asansor3kat = enkucukkat;
                                }
                            }
                        } else {
                            if (asansor3yolcu < 10) {
                                for (int i = 0; i < 10; i++) {
                                    if (asansor3yuk[i] == 0 && !kat2kuyruk.isEmpty()) {
                                        Integer a = kat2kuyruk.poll();
                                        if (a != null) {
                                            asansor3yuk[i] = a;
                                            asansor3yolcu++;
                                            System.out.println("Asansor3: 2. kattaki bir yolcu alindi.");
                                        }
                                    }
                                }
                            }
                            asansor3kat = 1;
                        }
                    }
                    if (asansor3kat == 3) {
                        System.out.println("asansor3: kat 3 de.");
                        if (asansor3yon == true) {
                            System.out.println("asansor3: dagitimda.");
                            for (int i = 0; i < 10; i++) {
                                if (asansor3yuk[i] == 3) {
                                    System.out.println("asansor3: kat3 de yolcu indirildi.");
                                    asansor3yuk[i] = 0;
                                    asansor3yolcu--;
                                    kat4insan++;
                                }
                            }

                            if (asansor3yolcu == 0) {
                                System.out.println("asansor3: yolcu kalmadi. 3. kattan itibaren toplama modu aktif.");
                                if (kat5kuyruk.size() > 0) {
                                    asansor3kat = 5;
                                } else if (kat4kuyruk.size() > 0) {
                                    asansor3kat = 4;
                                }
                                asansor3yon = false;
                            } else {
                                System.out.println("asansor3: kat3 de yolcu indirme islemi basariyla tamamlandi. sonraki kata gidiliyor.");
                                int enkucukkat = 5;
                                for (int i = 0; i < 10; i++) {
                                    if (asansor3yuk[i] < enkucukkat) {
                                        if (asansor3yuk[i] > 0) {
                                            enkucukkat = asansor3yuk[i];
                                        }
                                    }
                                    asansor3kat = enkucukkat;
                                }
                            }
                        } else {
                            if (asansor3yolcu < 10) {
                                for (int i = 0; i < 10; i++) {
                                    if (asansor3yuk[i] == 0 && !kat3kuyruk.isEmpty()) {
                                        Integer a = kat3kuyruk.poll();
                                        if (a != null) {
                                            asansor3yuk[i] = a;
                                            asansor3yolcu++;
                                            System.out.println("Asansor3: 3. kattaki bir yolcu alindi.");
                                        }
                                    }
                                }
                            }
                            asansor3kat = 2;
                        }
                    }
                    if (asansor3kat == 4) {
                        System.out.println("asansor3: asansor3 kat 4 de.");
                        if (asansor3yon == true) {
                            System.out.println("asansor3: asansor3 dagitimda.");
                            for (int i = 0; i < 10; i++) {
                                if (asansor3yuk[i] == 4) {
                                    System.out.println("asansor3: kat4 de yolcu indirildi.");
                                    asansor3yuk[i] = 0;
                                    asansor3yolcu--;
                                    kat5insan++;
                                }
                            }

                            if (asansor3yolcu == 0) {
                                System.out.println("asansor3: yolcu kalmadi. 4. kattan itibaren toplama modu aktif.");
                                if (kat5kuyruk.size() > 0) {
                                    asansor3kat = 5;
                                }
                                asansor3yon = false;
                            } else {
                                System.out.println("asansor3: kat4 de yolcu indirme islemi basariyla tamamlandi. sonraki kata gidiliyor.");
                                int enkucukkat = 5;
                                for (int i = 0; i < 10; i++) {
                                    if (asansor3yuk[i] < enkucukkat) {
                                        if (asansor3yuk[i] > 0) {
                                            enkucukkat = asansor3yuk[i];
                                        }
                                    }
                                    asansor3kat = enkucukkat;
                                }
                            }
                        } else {
                            if (asansor3yolcu < 10) {
                                for (int i = 0; i < 10; i++) {
                                    if (asansor3yuk[i] == 0 && !kat4kuyruk.isEmpty()) {
                                        Integer a = kat4kuyruk.poll();
                                        if (a != null) {
                                            asansor3yuk[i] = a;
                                            asansor3yolcu++;
                                            System.out.println("Asansor3: 4. kattaki bir yolcu alindi.");
                                        }
                                    }
                                }
                            }
                            asansor3kat = 3;
                        }
                    }
                    if (asansor3kat == 5) {
                        System.out.println("asansor3: kat 5 de.");
                        if (asansor3yon == true) {
                            System.out.println("asansor3: dagitimda.");
                            for (int i = 0; i < 10; i++) {
                                if (asansor3yuk[i] == 5) {
                                    System.out.println("asansor3: kat5 de yolcu indirildi.");
                                    asansor3yuk[i] = 0;
                                    asansor3yolcu--;
                                    kat5insan++;
                                }
                            }
                            System.out.println("asansor3: kat5 de yolcu indirme islemi basariyla tamamlandi. sonraki kata gidiliyor.");

                            if (asansor3yolcu == 0) {
                                System.out.println("asansor3: yolcu kalmadi. 5. kattan itibaren toplama modu aktif.");
                                asansor3yon = false;
                            }
                        } else {
                            if (asansor3yolcu < 10) {
                                for (int i = 0; i < 10; i++) {
                                    if (asansor3yuk[i] == 0 && !kat5kuyruk.isEmpty()) {
                                        Integer a = kat5kuyruk.poll();
                                        if (a != null) {
                                            asansor3yuk[i] = a;
                                            asansor3yolcu++;
                                            System.out.println("Asansor3: 5. kattaki bir yolcu alindi.");
                                        }
                                    }
                                }
                            }
                            asansor3kat = 4;
                        }
                    }

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    };
    public static Thread asansor4 = new Thread() {
        @Override
        public void run() {
            while (true) {
                while (asansor4run == true || asansor4kat != 1) {
                    if (asansor4kat == 1) {
                        System.out.println("asansor4: kat 1 de.");
                        asansor4yon = true;
                        System.out.println("asansor4: Zemin katta cikan kisi sayisi: " + asansor4yolcu);
                        asansor4yolcu = 0;
                        for (int i = 0; i < 10; i++) {
                            asansor4yuk[i] = 0;
                        }
                        System.out.println("asansor4: Yeni yolcular zemin kattan Asansore aliniyor...");
                        if (kat1kuyruk.size() > 10) {
                            for (int i = 0; i < 10; i++) {
                                asansor4yuk[i] = kat1kuyruk.poll();
                                asansor4yolcu++;
                                System.out.println("asansor4: alinanlar= " + asansor4yuk[i]);
                            }
                        } else if (kat1kuyruk.size() > 0) {
                            for (int i = 0; i < kat1kuyruk.size(); i++) {
                                asansor4yuk[i] = kat1kuyruk.poll();
                                asansor4yolcu++;
                                System.out.println("asansor4: alinanlar= " + asansor4yuk[i]);
                            }
                        }
                        int enkucukkat = 5;
                        for (int i = 0; i < 10; i++) {
                            if (asansor4yuk[i] < enkucukkat) {
                                if (asansor4yuk[i] > 0) {
                                    enkucukkat = asansor4yuk[i];
                                }
                            }
                            asansor4kat = enkucukkat;
                        }
                    }
                    if (asansor4kat == 2) {
                        System.out.println("asansor4: asansor4 kat 2 de.");
                        if (asansor4yon == true) {
                            System.out.println("asansor4: asansor4 dagitimda.");
                            for (int i = 0; i < 10; i++) {
                                if (asansor4yuk[i] == 2) {
                                    System.out.println("asansor4: kat2 de yolcu indirildi.");
                                    asansor4yuk[i] = 0;
                                    asansor4yolcu--;
                                    kat3insan++;
                                }
                            }

                            if (asansor4yolcu == 0) {
                                System.out.println("asansor4: yolcu kalmadi. 2. kattan itibaren toplama modu aktif.");
                                if (kat5kuyruk.size() > 0) {
                                    asansor4kat = 5;
                                } else if (kat4kuyruk.size() > 0) {
                                    asansor4kat = 4;
                                } else if (kat3kuyruk.size() > 0) {
                                    asansor4kat = 3;
                                }
                                asansor4yon = false;
                            } else {
                                System.out.println("asansor4: kat2 de yolcu indirme islemi basariyla tamamlandi. sonraki kata gidiliyor.");
                                int enkucukkat = 5;
                                for (int i = 0; i < 10; i++) {
                                    if (asansor4yuk[i] < enkucukkat) {
                                        if (asansor4yuk[i] > 0) {
                                            enkucukkat = asansor4yuk[i];
                                        }
                                    }
                                    asansor4kat = enkucukkat;
                                }
                            }
                        } else {
                            if (asansor4yolcu < 10) {
                                for (int i = 0; i < 10; i++) {
                                    if (asansor4yuk[i] == 0 && !kat2kuyruk.isEmpty()) {
                                        Integer a = kat2kuyruk.poll();
                                        if (a != null) {
                                            asansor4yuk[i] = a;
                                            asansor4yolcu++;
                                            System.out.println("Asansor4: 2. kattaki bir yolcu alindi.");
                                        }
                                    }
                                }
                            }
                            asansor4kat = 1;
                        }
                    }
                    if (asansor4kat == 3) {
                        System.out.println("asansor4: kat 3 de.");
                        if (asansor4yon == true) {
                            System.out.println("asansor4: dagitimda.");
                            for (int i = 0; i < 10; i++) {
                                if (asansor4yuk[i] == 3) {
                                    System.out.println("asansor4: kat3 de yolcu indirildi.");
                                    asansor4yuk[i] = 0;
                                    asansor4yolcu--;
                                    kat4insan++;
                                }
                            }

                            if (asansor4yolcu == 0) {
                                System.out.println("asansor4: yolcu kalmadi. 3. kattan itibaren toplama modu aktif.");
                                if (kat5kuyruk.size() > 0) {
                                    asansor4kat = 5;
                                } else if (kat4kuyruk.size() > 0) {
                                    asansor4kat = 4;
                                }
                                asansor4yon = false;
                            } else {
                                System.out.println("asansor4: kat3 de yolcu indirme islemi basariyla tamamlandi. sonraki kata gidiliyor.");
                                int enkucukkat = 5;
                                for (int i = 0; i < 10; i++) {
                                    if (asansor4yuk[i] < enkucukkat) {
                                        if (asansor4yuk[i] > 0) {
                                            enkucukkat = asansor4yuk[i];
                                        }
                                    }
                                    asansor4kat = enkucukkat;
                                }
                            }
                        } else {
                            if (asansor4yolcu < 10) {
                                for (int i = 0; i < 10; i++) {
                                    if (asansor4yuk[i] == 0 && !kat3kuyruk.isEmpty()) {
                                        Integer a = kat3kuyruk.poll();
                                        if (a != null) {
                                            asansor4yuk[i] = a;
                                            asansor4yolcu++;
                                            System.out.println("Asansor4: 3. kattaki bir yolcu alindi.");
                                        }
                                    }
                                }
                            }
                            asansor4kat = 2;
                        }
                    }
                    if (asansor4kat == 4) {
                        System.out.println("asansor4: asansor4 kat 4 de.");
                        if (asansor4yon == true) {
                            System.out.println("asansor4: asansor4 dagitimda.");
                            for (int i = 0; i < 10; i++) {
                                if (asansor4yuk[i] == 4) {
                                    System.out.println("asansor4: kat4 de yolcu indirildi.");
                                    asansor4yuk[i] = 0;
                                    asansor4yolcu--;
                                    kat5insan++;
                                }
                            }

                            if (asansor4yolcu == 0) {
                                System.out.println("asansor4: yolcu kalmadi. 4. kattan itibaren toplama modu aktif.");
                                if (kat5kuyruk.size() > 0) {
                                    asansor4kat = 5;
                                }
                                asansor4yon = false;
                            } else {
                                System.out.println("asansor4: kat4 de yolcu indirme islemi basariyla tamamlandi. sonraki kata gidiliyor.");
                                int enkucukkat = 5;
                                for (int i = 0; i < 10; i++) {
                                    if (asansor4yuk[i] < enkucukkat) {
                                        if (asansor4yuk[i] > 0) {
                                            enkucukkat = asansor4yuk[i];
                                        }
                                    }
                                    asansor4kat = enkucukkat;
                                }
                            }
                        } else {
                            if (asansor4yolcu < 10) {
                                for (int i = 0; i < 10; i++) {
                                    if (asansor4yuk[i] == 0 && !kat4kuyruk.isEmpty()) {
                                        Integer a = kat4kuyruk.poll();
                                        if (a != null) {
                                            asansor4yuk[i] = a;
                                            asansor4yolcu++;
                                            System.out.println("Asansor4: 4. kattaki bir yolcu alindi.");
                                        }
                                    }
                                }
                            }
                            asansor4kat = 3;
                        }
                    }
                    if (asansor4kat == 5) {
                        System.out.println("asansor4: kat 5 de.");
                        if (asansor4yon == true) {
                            System.out.println("asansor4: dagitimda.");
                            for (int i = 0; i < 10; i++) {
                                if (asansor4yuk[i] == 5) {
                                    System.out.println("asansor4: kat5 de yolcu indirildi.");
                                    asansor4yuk[i] = 0;
                                    asansor4yolcu--;
                                    kat5insan++;
                                }
                            }
                            System.out.println("asansor4: kat5 de yolcu indirme islemi basariyla tamamlandi. sonraki kata gidiliyor.");

                            if (asansor4yolcu == 0) {
                                System.out.println("asansor4: yolcu kalmadi. 5. kattan itibaren toplama modu aktif.");
                                asansor4yon = false;
                            }
                        } else {
                            if (asansor4yolcu < 10) {
                                for (int i = 0; i < 10; i++) {
                                    if (asansor4yuk[i] == 0 && !kat5kuyruk.isEmpty()) {
                                        Integer a = kat5kuyruk.poll();
                                        if (a != null) {
                                            asansor4yuk[i] = a;
                                            asansor4yolcu++;
                                            System.out.println("Asansor4: 5. kattaki bir yolcu alindi.");
                                        }
                                    }
                                }
                            }
                            asansor4kat = 4;
                        }
                    }

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    };
    public static Thread asansor5 = new Thread() {
        @Override
        public void run() {
            while (true) {
                while (asansor5run == true || asansor5kat != 1) {
                    if (asansor5kat == 1) {
                        System.out.println("asansor5: kat 1 de.");
                        asansor5yon = true;
                        System.out.println("asansor5: Zemin katta cikan kisi sayisi: " + asansor5yolcu);
                        asansor5yolcu = 0;
                        for (int i = 0; i < 10; i++) {
                            asansor5yuk[i] = 0;
                        }
                        System.out.println("asansor5: Yeni yolcular zemin kattan Asansore aliniyor...");
                        if (kat1kuyruk.size() > 10) {
                            for (int i = 0; i < 10; i++) {
                                asansor5yuk[i] = kat1kuyruk.poll();
                                asansor5yolcu++;
                                System.out.println("asansor5: alinanlar= " + asansor5yuk[i]);
                            }
                        } else if (kat1kuyruk.size() > 0) {
                            for (int i = 0; i < kat1kuyruk.size(); i++) {
                                asansor5yuk[i] = kat1kuyruk.poll();
                                asansor5yolcu++;
                                System.out.println("asansor5: alinanlar= " + asansor5yuk[i]);
                            }
                        }
                        int enkucukkat = 5;
                        for (int i = 0; i < 10; i++) {
                            if (asansor5yuk[i] < enkucukkat) {
                                if (asansor5yuk[i] > 0) {
                                    enkucukkat = asansor5yuk[i];
                                }
                            }
                            asansor5kat = enkucukkat;
                        }
                    }
                    if (asansor5kat == 2) {
                        System.out.println("asansor5: asansor5 kat 2 de.");
                        if (asansor5yon == true) {
                            System.out.println("asansor5: asansor5 dagitimda.");
                            for (int i = 0; i < 10; i++) {
                                if (asansor5yuk[i] == 2) {
                                    System.out.println("asansor5: kat2 de yolcu indirildi.");
                                    asansor5yuk[i] = 0;
                                    asansor5yolcu--;
                                    kat3insan++;
                                }
                            }

                            if (asansor5yolcu == 0) {
                                System.out.println("asansor5: yolcu kalmadi. 2. kattan itibaren toplama modu aktif.");
                                if (kat5kuyruk.size() > 0) {
                                    asansor5kat = 5;
                                } else if (kat4kuyruk.size() > 0) {
                                    asansor5kat = 4;
                                } else if (kat3kuyruk.size() > 0) {
                                    asansor5kat = 3;
                                }
                                asansor5yon = false;
                            } else {
                                System.out.println("asansor5: kat2 de yolcu indirme islemi basariyla tamamlandi. sonraki kata gidiliyor.");
                                int enkucukkat = 5;
                                for (int i = 0; i < 10; i++) {
                                    if (asansor5yuk[i] < enkucukkat) {
                                        if (asansor5yuk[i] > 0) {
                                            enkucukkat = asansor5yuk[i];
                                        }
                                    }
                                    asansor5kat = enkucukkat;
                                }
                            }
                        } else {
                            if (asansor5yolcu < 10) {
                                for (int i = 0; i < 10; i++) {
                                    if (asansor5yuk[i] == 0 && !kat2kuyruk.isEmpty()) {
                                        Integer a = kat2kuyruk.poll();
                                        if (a != null) {
                                            asansor5yuk[i] = a;
                                            asansor5yolcu++;
                                            System.out.println("Asansor5: 2. kattaki bir yolcu alindi.");
                                        }
                                    }
                                }
                            }
                            asansor5kat = 1;
                        }
                    }
                    if (asansor5kat == 3) {
                        System.out.println("asansor5: kat 3 de.");
                        if (asansor5yon == true) {
                            System.out.println("asansor5: dagitimda.");
                            for (int i = 0; i < 10; i++) {
                                if (asansor5yuk[i] == 3) {
                                    System.out.println("asansor5: kat3 de yolcu indirildi.");
                                    asansor5yuk[i] = 0;
                                    asansor5yolcu--;
                                    kat4insan++;
                                }
                            }

                            if (asansor5yolcu == 0) {
                                System.out.println("asansor5: yolcu kalmadi. 3. kattan itibaren toplama modu aktif.");
                                if (kat5kuyruk.size() > 0) {
                                    asansor5kat = 5;
                                } else if (kat4kuyruk.size() > 0) {
                                    asansor5kat = 4;
                                }
                                asansor5yon = false;
                            } else {
                                System.out.println("asansor5: kat3 de yolcu indirme islemi basariyla tamamlandi. sonraki kata gidiliyor.");
                                int enkucukkat = 5;
                                for (int i = 0; i < 10; i++) {
                                    if (asansor5yuk[i] < enkucukkat) {
                                        if (asansor5yuk[i] > 0) {
                                            enkucukkat = asansor5yuk[i];
                                        }
                                    }
                                    asansor5kat = enkucukkat;
                                }
                            }
                        } else {
                            if (asansor5yolcu < 10) {
                                for (int i = 0; i < 10; i++) {
                                    if (asansor5yuk[i] == 0 && !kat3kuyruk.isEmpty()) {
                                        Integer a = kat3kuyruk.poll();
                                        if (a != null) {
                                            asansor5yuk[i] = a;
                                            asansor5yolcu++;
                                            System.out.println("Asansor5: 3. kattaki bir yolcu alindi.");
                                        }
                                    }
                                }
                            }
                            asansor5kat = 2;
                        }
                    }
                    if (asansor5kat == 4) {
                        System.out.println("asansor5: asansor5 kat 4 de.");
                        if (asansor5yon == true) {
                            System.out.println("asansor5: asansor5 dagitimda.");
                            for (int i = 0; i < 10; i++) {
                                if (asansor5yuk[i] == 4) {
                                    System.out.println("asansor5: kat4 de yolcu indirildi.");
                                    asansor5yuk[i] = 0;
                                    asansor5yolcu--;
                                    kat5insan++;
                                }
                            }

                            if (asansor5yolcu == 0) {
                                System.out.println("asansor5: yolcu kalmadi. 4. kattan itibaren toplama modu aktif.");
                                if (kat5kuyruk.size() > 0) {
                                    asansor5kat = 5;
                                }
                                asansor5yon = false;
                            } else {
                                System.out.println("asansor5: kat4 de yolcu indirme islemi basariyla tamamlandi. sonraki kata gidiliyor.");
                                int enkucukkat = 5;
                                for (int i = 0; i < 10; i++) {
                                    if (asansor5yuk[i] < enkucukkat) {
                                        if (asansor5yuk[i] > 0) {
                                            enkucukkat = asansor5yuk[i];
                                        }
                                    }
                                    asansor5kat = enkucukkat;
                                }
                            }
                        } else {
                            if (asansor5yolcu < 10) {
                                for (int i = 0; i < 10; i++) {
                                    if (asansor5yuk[i] == 0 && !kat4kuyruk.isEmpty()) {
                                        Integer a = kat4kuyruk.poll();
                                        if (a != null) {
                                            asansor5yuk[i] = a;
                                            asansor5yolcu++;
                                            System.out.println("Asansor5: 4. kattaki bir yolcu alindi.");
                                        }
                                    }
                                }
                            }
                            asansor5kat = 3;
                        }
                    }
                    if (asansor5kat == 5) {
                        System.out.println("asansor5: kat 5 de.");
                        if (asansor5yon == true) {
                            System.out.println("asansor5: dagitimda.");
                            for (int i = 0; i < 10; i++) {
                                if (asansor5yuk[i] == 5) {
                                    System.out.println("asansor5: kat5 de yolcu indirildi.");
                                    asansor5yuk[i] = 0;
                                    asansor5yolcu--;
                                    kat5insan++;
                                }
                            }
                            System.out.println("asansor5: kat5 de yolcu indirme islemi basariyla tamamlandi. sonraki kata gidiliyor.");

                            if (asansor5yolcu == 0) {
                                System.out.println("asansor5: yolcu kalmadi. 5. kattan itibaren toplama modu aktif.");
                                asansor5yon = false;
                            }
                        } else {
                            if (asansor5yolcu < 10) {
                                for (int i = 0; i < 10; i++) {
                                    if (asansor5yuk[i] == 0 && !kat5kuyruk.isEmpty()) {
                                        Integer a = kat5kuyruk.poll();
                                        if (a != null) {
                                            asansor5yuk[i] = a;
                                            asansor5yolcu++;
                                            System.out.println("Asansor5: 5. kattaki bir yolcu alindi.");
                                        }
                                    }
                                }
                            }
                            asansor5kat = 4;
                        }
                    }

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        timer1.schedule(avmgiris, 0, 500);
        timer2.schedule(avmcikis, 0, 1000);
        timer3.schedule(kuyrukkontrol, 0, 1000);
        asansor1.start();
        asansor2.start();
        asansor3.start();
        asansor4.start();
        asansor5.start();
    }
}
