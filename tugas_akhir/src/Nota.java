import java.util.Objects;

public class Nota extends Orderan {
    double subtotal, tvproses, tvagent, diskon, total;

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTvproses() {
        return tvproses;
    }

    public void setTvproses(double tvproses) {
        this.tvproses = tvproses;
    }

    public double getTvagent() {
        return tvagent;
    }

    public void setTvagent(double tvagent) {
        this.tvagent = tvagent;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

//    public Nota() {
//        this.subtotal = subtotal = 0;
//        this.tvproses = tvproses = 0;
//        this.tvagent = tvagent = 0;
//        this.diskon = diskon = 0;
//        this.total = total = 0;
//    }

    public void hitung_subtotal() {
        if (Objects.equals(rank_awal, "Iron 1") || Objects.equals(rank_awal, "iron 1")) {
            if (Objects.equals(rank_tujuan, "Iron 2") || Objects.equals(rank_tujuan, "iron 2")) {
                subtotal += 30000;
            } else if (Objects.equals(rank_tujuan, "Iron 3") || Objects.equals(rank_tujuan, "iron 3")) {
                subtotal += 45000;
            } else if (Objects.equals(rank_tujuan, "Bronze 1") || Objects.equals(rank_tujuan, "bronze 1")) {
                subtotal += 60000;
            } else if (Objects.equals(rank_tujuan, "Bronze 2") || Objects.equals(rank_tujuan, "bronze 2")) {
                subtotal += 75000;
            } else if (Objects.equals(rank_tujuan, "Bronze 3") || Objects.equals(rank_tujuan, "bronze 3 ")) {
                subtotal += 90000;
            } else if (Objects.equals(rank_tujuan, "Silver 1") || Objects.equals(rank_tujuan, "silver 1")) {
                subtotal += 105000;
            } else if (Objects.equals(rank_tujuan, "Silver 2") || Objects.equals(rank_tujuan, "silver 2")) {
                subtotal += 120000;
            } else if (Objects.equals(rank_tujuan, "Silver 3") || Objects.equals(rank_tujuan, "silver 3")) {
                subtotal += 135000;
            } else if (Objects.equals(rank_tujuan, "Gold 1") || Objects.equals(rank_tujuan, "gold 1")) {
                subtotal += 150000;
            }
        } else if (Objects.equals(rank_awal, "Iron 2") || Objects.equals(rank_awal, "iron 2")) {
            if (Objects.equals(rank_tujuan, "Iron 3") || Objects.equals(rank_tujuan, "iron 3")) {
                subtotal += 30000;
            } else if (Objects.equals(rank_tujuan, "Bronze 1") || Objects.equals(rank_tujuan, "bronze 1")) {
                subtotal += 45000;
            } else if (Objects.equals(rank_tujuan, "Bronze 2") || Objects.equals(rank_tujuan, "bronze 2")) {
                subtotal += 60000;
            } else if (Objects.equals(rank_tujuan, "Bronze 3") || Objects.equals(rank_tujuan, "bronze 3")) {
                subtotal += 75000;
            } else if (Objects.equals(rank_tujuan, "Silver 1") || Objects.equals(rank_tujuan, "silver 1 ")) {
                subtotal += 90000;
            } else if (Objects.equals(rank_tujuan, "Silver 2") || Objects.equals(rank_tujuan, "silver 2")) {
                subtotal += 105000;
            } else if (Objects.equals(rank_tujuan, "Silver 3") || Objects.equals(rank_tujuan, "silver 3")) {
                subtotal += 120000;
            } else if (Objects.equals(rank_tujuan, "Gold 1") || Objects.equals(rank_tujuan, "gold 1")) {
                subtotal += 135000;
            } else if (Objects.equals(rank_tujuan, "Gold 2") || Objects.equals(rank_tujuan, "gold 2")) {
                subtotal += 150000;
            }
        } else if (Objects.equals(rank_awal, "Iron 3") || Objects.equals(rank_awal, "iron 3")) {
            if (Objects.equals(rank_tujuan, "Bronze 1") || Objects.equals(rank_tujuan, "bronze 1")) {
                subtotal += 30000;
            } else if (Objects.equals(rank_tujuan, "Bronze 2") || Objects.equals(rank_tujuan, "bronze 2")) {
                subtotal += 45000;
            } else if (Objects.equals(rank_tujuan, "Bronze 3") || Objects.equals(rank_tujuan, "bronze 3")) {
                subtotal += 60000;
            } else if (Objects.equals(rank_tujuan, "Silver 1") || Objects.equals(rank_tujuan, "silver 1 ")) {
                subtotal += 75000;
            } else if (Objects.equals(rank_tujuan, "Silver 2") || Objects.equals(rank_tujuan, "silver 2")) {
                subtotal += 90000;
            } else if (Objects.equals(rank_tujuan, "Silver 3") || Objects.equals(rank_tujuan, "silver 3")) {
                subtotal += 105000;
            } else if (Objects.equals(rank_tujuan, "Gold 1") || Objects.equals(rank_tujuan, "gold 1")) {
                subtotal += 120000;
            } else if (Objects.equals(rank_tujuan, "Gold 2") || Objects.equals(rank_tujuan, "gold 2")) {
                subtotal += 135000;
            } else if (Objects.equals(rank_tujuan, "Gold 3") || Objects.equals(rank_tujuan, "gold 3")) {
                subtotal += 150000;
            }
        } else if (Objects.equals(rank_awal, "Bronze 1") || Objects.equals(rank_awal, "bronze 1")) {
            if (Objects.equals(rank_tujuan, "Bronze 2") || Objects.equals(rank_tujuan, "bronze 2")) {
                subtotal += 30000;
            } else if (Objects.equals(rank_tujuan, "Bronze 3") || Objects.equals(rank_tujuan, "bronze 3")) {
                subtotal += 45000;
            } else if (Objects.equals(rank_tujuan, "Silver 1") || Objects.equals(rank_tujuan, "silver 1 ")) {
                subtotal += 60000;
            } else if (Objects.equals(rank_tujuan, "Silver 2") || Objects.equals(rank_tujuan, "silver 2")) {
                subtotal += 75000;
            } else if (Objects.equals(rank_tujuan, "Silver 3") || Objects.equals(rank_tujuan, "silver 3")) {
                subtotal += 90000;
            } else if (Objects.equals(rank_tujuan, "Gold 1") || Objects.equals(rank_tujuan, "gold 1")) {
                subtotal += 105000;
            } else if (Objects.equals(rank_tujuan, "Gold 2") || Objects.equals(rank_tujuan, "gold 2")) {
                subtotal += 120000;
            } else if (Objects.equals(rank_tujuan, "Gold 3") || Objects.equals(rank_tujuan, "gold 3")) {
                subtotal += 135000;
            } else if (Objects.equals(rank_tujuan, "Platinum 1") || Objects.equals(rank_tujuan, "platinum 1")) {
                subtotal += 135000;
            }
        } else if (Objects.equals(rank_awal, "Bronze 2") || Objects.equals(rank_awal, "bronze 2")) {
            if (Objects.equals(rank_tujuan, "Bronze 3") || Objects.equals(rank_tujuan, "bronze 3")) {
                subtotal += 30000;
            } else if (Objects.equals(rank_tujuan, "Silver 1") || Objects.equals(rank_tujuan, "silver 1 ")) {
                subtotal += 45000;
            } else if (Objects.equals(rank_tujuan, "Silver 2") || Objects.equals(rank_tujuan, "silver 2")) {
                subtotal += 60000;
            } else if (Objects.equals(rank_tujuan, "Silver 3") || Objects.equals(rank_tujuan, "silver 3")) {
                subtotal += 75000;
            } else if (Objects.equals(rank_tujuan, "Gold 1") || Objects.equals(rank_tujuan, "gold 1")) {
                subtotal += 90000;
            } else if (Objects.equals(rank_tujuan, "Gold 2") || Objects.equals(rank_tujuan, "gold 2")) {
                subtotal += 105000;
            } else if (Objects.equals(rank_tujuan, "Gold 3") || Objects.equals(rank_tujuan, "gold 3")) {
                subtotal += 120000;
            } else if (Objects.equals(rank_tujuan, "Platinum 1") || Objects.equals(rank_tujuan, "platinum 1")) {
                subtotal += 135000;
            } else if (Objects.equals(rank_tujuan, "Platinum 2") || Objects.equals(rank_tujuan, "platinum 2")) {
                subtotal += 150000;
            }
        } else if (Objects.equals(rank_awal, "Bronze 3") || Objects.equals(rank_awal, "bronze 3")) {
            if (Objects.equals(rank_tujuan, "Silver 1") || Objects.equals(rank_tujuan, "silver 1 ")) {
                subtotal += 30000;
            } else if (Objects.equals(rank_tujuan, "Silver 2") || Objects.equals(rank_tujuan, "silver 2")) {
                subtotal += 45000;
            } else if (Objects.equals(rank_tujuan, "Silver 3") || Objects.equals(rank_tujuan, "silver 3")) {
                subtotal += 60000;
            } else if (Objects.equals(rank_tujuan, "Gold 1") || Objects.equals(rank_tujuan, "gold 1")) {
                subtotal += 75000;
            } else if (Objects.equals(rank_tujuan, "Gold 2") || Objects.equals(rank_tujuan, "gold 2")) {
                subtotal += 90000;
            } else if (Objects.equals(rank_tujuan, "Gold 3") || Objects.equals(rank_tujuan, "gold 3")) {
                subtotal += 105000;
            } else if (Objects.equals(rank_tujuan, "Platinum 1") || Objects.equals(rank_tujuan, "platinum 1")) {
                subtotal += 120000;
            } else if (Objects.equals(rank_tujuan, "Platinum 2") || Objects.equals(rank_tujuan, "platinum 2")) {
                subtotal += 135000;
            } else if (Objects.equals(rank_tujuan, "Platinum 3") || Objects.equals(rank_tujuan, "platinum 3")) {
                subtotal += 150000;
            }
        } else if (Objects.equals(rank_awal, "Silver 1") || Objects.equals(rank_awal, "silver 1")) {
            if (Objects.equals(rank_tujuan, "Silver 2") || Objects.equals(rank_tujuan, "silver 2")) {
                subtotal += 30000;
            } else if (Objects.equals(rank_tujuan, "Silver 3") || Objects.equals(rank_tujuan, "silver 3")) {
                subtotal += 45000;
            } else if (Objects.equals(rank_tujuan, "Gold 1") || Objects.equals(rank_tujuan, "gold 1")) {
                subtotal += 60000;
            } else if (Objects.equals(rank_tujuan, "Gold 2") || Objects.equals(rank_tujuan, "gold 2")) {
                subtotal += 75000;
            } else if (Objects.equals(rank_tujuan, "Gold 3") || Objects.equals(rank_tujuan, "gold 3")) {
                subtotal += 90000;
            } else if (Objects.equals(rank_tujuan, "Platinum 1") || Objects.equals(rank_tujuan, "platinum 1")) {
                subtotal += 105000;
            } else if (Objects.equals(rank_tujuan, "Platinum 2") || Objects.equals(rank_tujuan, "platinum 2")) {
                subtotal += 120000;
            } else if (Objects.equals(rank_tujuan, "Platinum 3") || Objects.equals(rank_tujuan, "platinum 3")) {
                subtotal += 135000;
            } else if (Objects.equals(rank_tujuan, "Diamond 1") || Objects.equals(rank_tujuan, "diamond 1")) {
                subtotal += 175000;
            }
        } else if (Objects.equals(rank_awal, "Silver 2") || Objects.equals(rank_awal, "silver 2")) {
            if (Objects.equals(rank_tujuan, "Silver 3") || Objects.equals(rank_tujuan, "silver 3")) {
                subtotal += 30000;
            } else if (Objects.equals(rank_tujuan, "Gold 1") || Objects.equals(rank_tujuan, "gold 1")) {
                subtotal += 45000;
            } else if (Objects.equals(rank_tujuan, "Gold 2") || Objects.equals(rank_tujuan, "gold 2")) {
                subtotal += 60000;
            } else if (Objects.equals(rank_tujuan, "Gold 3") || Objects.equals(rank_tujuan, "gold 3")) {
                subtotal += 75000;
            } else if (Objects.equals(rank_tujuan, "Platinum 1") || Objects.equals(rank_tujuan, "platinum 1")) {
                subtotal += 95000;
            } else if (Objects.equals(rank_tujuan, "Platinum 2") || Objects.equals(rank_tujuan, "platinum 2")) {
                subtotal += 115000;
            } else if (Objects.equals(rank_tujuan, "Platinum 3") || Objects.equals(rank_tujuan, "platinum 3")) {
                subtotal += 135000;
            } else if (Objects.equals(rank_tujuan, "Diamond 1") || Objects.equals(rank_tujuan, "diamond 1")) {
                subtotal += 175000;
            } else if (Objects.equals(rank_tujuan, "Diamond 2") || Objects.equals(rank_tujuan, "diamond 2")) {
                subtotal += 215000;
            }
        } else if (Objects.equals(rank_awal, "Silver 3") || Objects.equals(rank_awal, "silver 3")) {
            if (Objects.equals(rank_tujuan, "Gold 1") || Objects.equals(rank_tujuan, "gold 1")) {
                subtotal += 30000;
            } else if (Objects.equals(rank_tujuan, "Gold 2") || Objects.equals(rank_tujuan, "gold 2")) {
                subtotal += 45000;
            } else if (Objects.equals(rank_tujuan, "Gold 3") || Objects.equals(rank_tujuan, "gold 3")) {
                subtotal += 60000;
            } else if (Objects.equals(rank_tujuan, "Platinum 1") || Objects.equals(rank_tujuan, "platinum 1")) {
                subtotal += 80000;
            } else if (Objects.equals(rank_tujuan, "Platinum 2") || Objects.equals(rank_tujuan, "platinum 2")) {
                subtotal += 100000;
            } else if (Objects.equals(rank_tujuan, "Platinum 3") || Objects.equals(rank_tujuan, "platinum 3")) {
                subtotal += 120000;
            } else if (Objects.equals(rank_tujuan, "Diamond 1") || Objects.equals(rank_tujuan, "diamond 1")) {
                subtotal += 160000;
            } else if (Objects.equals(rank_tujuan, "Diamond 2") || Objects.equals(rank_tujuan, "diamond 2")) {
                subtotal += 200000;
            } else if (Objects.equals(rank_tujuan, "Diamond 3") || Objects.equals(rank_tujuan, "diamond 3")) {
                subtotal += 250000;
            }
        } else if (Objects.equals(rank_awal, "Gold 1") || Objects.equals(rank_awal, "gold 1")) {
            if (Objects.equals(rank_tujuan, "Gold 2") || Objects.equals(rank_tujuan, "gold 2")) {
                subtotal += 30000;
            } else if (Objects.equals(rank_tujuan, "Gold 3") || Objects.equals(rank_tujuan, "gold 3")) {
                subtotal += 45000;
            } else if (Objects.equals(rank_tujuan, "Platinum 1") || Objects.equals(rank_tujuan, "platinum 1")) {
                subtotal += 65000;
            } else if (Objects.equals(rank_tujuan, "Platinum 2") || Objects.equals(rank_tujuan, "platinum 2")) {
                subtotal += 85000;
            } else if (Objects.equals(rank_tujuan, "Platinum 3") || Objects.equals(rank_tujuan, "platinum 3")) {
                subtotal += 105000;
            } else if (Objects.equals(rank_tujuan, "Diamond 1") || Objects.equals(rank_tujuan, "diamond 1")) {
                subtotal += 145000;
            } else if (Objects.equals(rank_tujuan, "Diamond 2") || Objects.equals(rank_tujuan, "diamond 2")) {
                subtotal += 185000;
            } else if (Objects.equals(rank_tujuan, "Diamond 3") || Objects.equals(rank_tujuan, "diamond 3")) {
                subtotal += 235000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 1") || Objects.equals(rank_tujuan, "ascendant 1")) {
                subtotal += 305000;
            }
        } else if (Objects.equals(rank_awal, "Gold 2") || Objects.equals(rank_awal, "gold 2")) {
            if (Objects.equals(rank_tujuan, "Gold 3") || Objects.equals(rank_tujuan, "gold 3")) {
                subtotal += 30000;
            } else if (Objects.equals(rank_tujuan, "Platinum 1") || Objects.equals(rank_tujuan, "platinum 1")) {
                subtotal += 50000;
            } else if (Objects.equals(rank_tujuan, "Platinum 2") || Objects.equals(rank_tujuan, "platinum 2")) {
                subtotal += 70000;
            } else if (Objects.equals(rank_tujuan, "Platinum 3") || Objects.equals(rank_tujuan, "platinum 3")) {
                subtotal += 90000;
            } else if (Objects.equals(rank_tujuan, "Diamond 1") || Objects.equals(rank_tujuan, "diamond 1")) {
                subtotal += 130000;
            } else if (Objects.equals(rank_tujuan, "Diamond 2") || Objects.equals(rank_tujuan, "diamond 2")) {
                subtotal += 170000;
            } else if (Objects.equals(rank_tujuan, "Diamond 3") || Objects.equals(rank_tujuan, "diamond 3")) {
                subtotal += 220000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 1") || Objects.equals(rank_tujuan, "ascendant 1")) {
                subtotal += 290000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 2") || Objects.equals(rank_tujuan, "ascendant 2")) {
                subtotal += 360000;
            }
        } else if (Objects.equals(rank_awal, "Gold 3") || Objects.equals(rank_awal, "gold 3")) {
            if (Objects.equals(rank_tujuan, "Platinum 1") || Objects.equals(rank_tujuan, "platinum 1")) {
                subtotal += 40000;
            } else if (Objects.equals(rank_tujuan, "Platinum 2") || Objects.equals(rank_tujuan, "platinum 2")) {
                subtotal += 60000;
            } else if (Objects.equals(rank_tujuan, "Platinum 3") || Objects.equals(rank_tujuan, "platinum 3")) {
                subtotal += 80000;
            } else if (Objects.equals(rank_tujuan, "Diamond 1") || Objects.equals(rank_tujuan, "diamond 1")) {
                subtotal += 120000;
            } else if (Objects.equals(rank_tujuan, "Diamond 2") || Objects.equals(rank_tujuan, "diamond 2")) {
                subtotal += 140000;
            } else if (Objects.equals(rank_tujuan, "Diamond 3") || Objects.equals(rank_tujuan, "diamond 3")) {
                subtotal += 190000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 1") || Objects.equals(rank_tujuan, "ascendant 1")) {
                subtotal += 260000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 2") || Objects.equals(rank_tujuan, "ascendant 2")) {
                subtotal += 330000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 3") || Objects.equals(rank_tujuan, "ascendant 3")) {
                subtotal += 410000;
            }
        } else if (Objects.equals(rank_awal, "Platinum 1") || Objects.equals(rank_awal, "platinum 1")) {
            if (Objects.equals(rank_tujuan, "Platinum 2") || Objects.equals(rank_tujuan, "platinum 2")) {
                subtotal += 40000;
            } else if (Objects.equals(rank_tujuan, "Platinum 3") || Objects.equals(rank_tujuan, "platinum 3")) {
                subtotal += 60000;
            } else if (Objects.equals(rank_tujuan, "Diamond 1") || Objects.equals(rank_tujuan, "diamond 1")) {
                subtotal += 100000;
            } else if (Objects.equals(rank_tujuan, "Diamond 2") || Objects.equals(rank_tujuan, "diamond 2")) {
                subtotal += 140000;
            } else if (Objects.equals(rank_tujuan, "Diamond 3") || Objects.equals(rank_tujuan, "diamond 3")) {
                subtotal += 190000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 1") || Objects.equals(rank_tujuan, "ascendant 1")) {
                subtotal += 260000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 2") || Objects.equals(rank_tujuan, "ascendant 2")) {
                subtotal += 330000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 3") || Objects.equals(rank_tujuan, "ascendant 3")) {
                subtotal += 410000;
            }
        } else if (Objects.equals(rank_awal, "Platinum 2") || Objects.equals(rank_awal, "platinum 2")) {
            if (Objects.equals(rank_tujuan, "Platinum 3") || Objects.equals(rank_tujuan, "platinum 3")) {
                subtotal += 40000;
            } else if (Objects.equals(rank_tujuan, "Diamond 1") || Objects.equals(rank_tujuan, "diamond 1")) {
                subtotal += 100000;
            } else if (Objects.equals(rank_tujuan, "Diamond 2") || Objects.equals(rank_tujuan, "diamond 2")) {
                subtotal += 140000;
            } else if (Objects.equals(rank_tujuan, "Diamond 3") || Objects.equals(rank_tujuan, "diamond 3")) {
                subtotal += 190000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 1") || Objects.equals(rank_tujuan, "ascendant 1")) {
                subtotal += 260000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 2") || Objects.equals(rank_tujuan, "ascendant 2")) {
                subtotal += 330000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 3") || Objects.equals(rank_tujuan, "ascendant 3")) {
                subtotal += 410000;
            }
        } else if (Objects.equals(rank_awal, "Platinum 3") || Objects.equals(rank_awal, "platinum 3")) {
            if (Objects.equals(rank_tujuan, "Diamond 1") || Objects.equals(rank_tujuan, "diamond 1")) {
                subtotal += 60000;
            } else if (Objects.equals(rank_tujuan, "Diamond 2") || Objects.equals(rank_tujuan, "diamond 2")) {
                subtotal += 100000;
            } else if (Objects.equals(rank_tujuan, "Diamond 3") || Objects.equals(rank_tujuan, "diamond 3")) {
                subtotal += 140000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 1") || Objects.equals(rank_tujuan, "ascendant 1")) {
                subtotal += 210000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 2") || Objects.equals(rank_tujuan, "ascendant 2")) {
                subtotal += 280000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 3") || Objects.equals(rank_tujuan, "ascendant 3")) {
                subtotal += 360000;
            }
        } else if (Objects.equals(rank_awal, "Diamond 1") || Objects.equals(rank_awal, "diamond 1")) {
            if (Objects.equals(rank_tujuan, "Diamond 2") || Objects.equals(rank_tujuan, "diamond 2")) {
                subtotal += 60000;
            } else if (Objects.equals(rank_tujuan, "Diamond 3") || Objects.equals(rank_tujuan, "diamond 3")) {
                subtotal += 110000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 1") || Objects.equals(rank_tujuan, "ascendant 1")) {
                subtotal += 180000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 2") || Objects.equals(rank_tujuan, "ascendant 2")) {
                subtotal += 250000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 3") || Objects.equals(rank_tujuan, "ascendant 3")) {
                subtotal += 330000;
            }
        } else if (Objects.equals(rank_awal, "Diamond 2") || Objects.equals(rank_awal, "diamond 2")) {
            if (Objects.equals(rank_tujuan, "Diamond 3") || Objects.equals(rank_tujuan, "diamond 3")) {
                subtotal += 60000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 1") || Objects.equals(rank_tujuan, "ascendant 1")) {
                subtotal += 130000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 2") || Objects.equals(rank_tujuan, "ascendant 2")) {
                subtotal += 200000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 3") || Objects.equals(rank_tujuan, "ascendant 3")) {
                subtotal += 280000;
            }
        } else if (Objects.equals(rank_awal, "Diamond 3") || Objects.equals(rank_awal, "diamond 3")) {
            if (Objects.equals(rank_tujuan, "Ascendant 1") || Objects.equals(rank_tujuan, "ascendant 1")) {
                subtotal += 70000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 2") || Objects.equals(rank_tujuan, "ascendant 2")) {
                subtotal += 150000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 3") || Objects.equals(rank_tujuan, "ascendant 3")) {
                subtotal += 230000;
            }
        } else if (Objects.equals(rank_awal, "Ascendant 1") || Objects.equals(rank_awal, "ascendant 1")) {
            if (Objects.equals(rank_tujuan, "Ascendant 2") || Objects.equals(rank_tujuan, "ascendant 2")) {
                subtotal += 70000;
            } else if (Objects.equals(rank_tujuan, "Ascendant 3") || Objects.equals(rank_tujuan, "ascendant 3")) {
                subtotal += 150000;
            }
        } else if (Objects.equals(rank_awal, "Ascendant 2") || Objects.equals(rank_awal, "ascendant 2")) {
            if (Objects.equals(rank_tujuan, "Ascendant 3") || Objects.equals(rank_tujuan, "ascendant 3")) {
                subtotal += 70000;
            }
        }
    }

    public void hitung_tvproses() {
        if (Objects.equals(rank_awal, "Iron 1") || Objects.equals(rank_awal, "iron 1") || Objects.equals(rank_awal, "Iron 2") || Objects.equals(rank_awal, "iron 2") || Objects.equals(rank_awal, "Iron 3") || Objects.equals(rank_awal, "iron 3")) {
            if (Objects.equals(jenis_proses, "1")) {
                tvproses += 0;
            } else if (Objects.equals(jenis_proses, "2")) {
                tvproses += 15000;
            } else if (Objects.equals(jenis_proses, "3")) {
                tvproses += 30000;
            }
        } else if (Objects.equals(rank_awal, "Bronze 1") || Objects.equals(rank_awal, "bronze 1") || Objects.equals(rank_awal, "Bronze 2") || Objects.equals(rank_awal, "bronze 2") || Objects.equals(rank_awal, "Bronze 3") || Objects.equals(rank_awal, "bronze 3")) {
            if (Objects.equals(jenis_proses, "1")) {
                tvproses += 0;
            } else if (Objects.equals(jenis_proses, "2")) {
                tvproses += 15000;
            } else if (Objects.equals(jenis_proses, "3")) {
                tvproses += 30000;
            }
        } else if (Objects.equals(rank_awal, "Silver 1") || Objects.equals(rank_awal, "silver 1") || Objects.equals(rank_awal, "Silver 2") || Objects.equals(rank_awal, "silver 2") || Objects.equals(rank_awal, "Silver 3") || Objects.equals(rank_awal, "silver 3")) {
            if (Objects.equals(jenis_proses, "1")) {
                tvproses += 10000;
            } else if (Objects.equals(jenis_proses, "2")) {
                tvproses += 20000;
            } else if (Objects.equals(jenis_proses, "3")) {
                tvproses += 30000;
            }
        } else if (Objects.equals(rank_awal, "Gold 1") || Objects.equals(rank_awal, "gold 1") || Objects.equals(rank_awal, "Gold 2") || Objects.equals(rank_awal, "gold 2") || Objects.equals(rank_awal, "Gold 3") || Objects.equals(rank_awal, "gold 3")) {
            if (Objects.equals(jenis_proses, "1")) {
                tvproses += 15000;
            } else if (Objects.equals(jenis_proses, "2")) {
                tvproses += 20000;
            } else if (Objects.equals(jenis_proses, "3")) {
                tvproses += 30000;
            }
        } else if (Objects.equals(rank_awal, "Platinum 1") || Objects.equals(rank_awal, "platinum 1") || Objects.equals(rank_awal, "Platinum 2") || Objects.equals(rank_awal, "platinum 2") || Objects.equals(rank_awal, "Platinum 3") || Objects.equals(rank_awal, "platinum 3")) {
            if (Objects.equals(jenis_proses, "1")) {
                tvproses += 10000;
            } else if (Objects.equals(jenis_proses, "2")) {
                tvproses += 25000;
            } else if (Objects.equals(jenis_proses, "3")) {
                tvproses += 40000;
            }
        } else if (Objects.equals(rank_awal, "Diamond 1") || Objects.equals(rank_awal, "diamond 1") || Objects.equals(rank_awal, "Diamond 2") || Objects.equals(rank_awal, "diamond 2") || Objects.equals(rank_awal, "Diamond 3") || Objects.equals(rank_awal, "diamond 3")) {
            if (Objects.equals(jenis_proses, "1")) {
                tvproses += 15000;
            } else if (Objects.equals(jenis_proses, "2")) {
                tvproses += 30000;
            } else if (Objects.equals(jenis_proses, "3")) {
                tvproses += 45000;
            }
        } else if (Objects.equals(rank_awal, "Ascendant 1") || Objects.equals(rank_awal, "ascendant 1") || Objects.equals(rank_awal, "Ascendant 2") || Objects.equals(rank_awal, "ascendant 2") || Objects.equals(rank_awal, "Ascendant 3") || Objects.equals(rank_awal, "ascendant 3")) {
            if (Objects.equals(jenis_proses, "1")) {
                tvproses += 20000;
            } else if (Objects.equals(jenis_proses, "2")) {
                tvproses += 35000;
            } else if (Objects.equals(jenis_proses, "3")) {
                tvproses += 50000;
            }
        }
    }

    public void hitung_tvagent(){
        if (Objects.equals(jenis_agent,"no")){
            tvagent+=0;
        } else if(!Objects.equals(jenis_agent, true)){
            tvagent+=25000;
        }
    }

    public void hitung_diskon(){

    }

    public void hitung_total(){
        total=subtotal+tvproses+tvagent-diskon;
    }

    public void total(){
        System.out.println("TOTAL ~~~~~~~~~~~~~~~~");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Subtotal\t\tRp "+subtotal);
        System.out.println("TV Proses\t\tRp "+tvproses);
        System.out.println("TV Agen\t\t\tRp "+tvagent);
        System.out.println("Diskon\t\t\tRp "+diskon);
        System.out.println("Total\t\t\tRp "+total);
    }

}
