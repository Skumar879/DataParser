public class ElectionResult {
    public double votes_dem;
    public double votes_gop;
    public double total_votes;
    public double per_dem;
    public double per_gop;
    public String diff;
    public double per_point_diff;
    public String state_abbr;
    public String county_name;
    public String combined_fips;
    public int NormLength = 12;

    public double getVotes_dem() {
        return votes_dem;
    }

    public void setVotes_dem(double votes_dem) {
        this.votes_dem = votes_dem;
    }

    public double getVotes_gop() {
        return votes_gop;
    }

    public void setVotes_gop(double votes_gop) {
        this.votes_gop = votes_gop;
    }

    public double getTotal_votes() {
        return total_votes;
    }

    public void setTotal_votes(double total_votes) {
        this.total_votes = total_votes;
    }

    public double getPer_dem() {
        return per_dem;
    }

    public void setPer_dem(double per_dem) {
        this.per_dem = per_dem;
    }

    public double getPer_gop() {
        return per_gop;
    }

    public void setPer_gop(double per_gop) {
        this.per_gop = per_gop;
    }

    public String getDiff() {
        return diff;
    }

    public void setDiff(String diff) {
        this.diff = diff;
    }

    public double getPer_point_diff() {
        return per_point_diff;
    }

    public void setPer_point_diff(double per_point_diff) {
        this.per_point_diff = per_point_diff;
    }

    public String getState_abbr() {
        return state_abbr;
    }

    public void setState_abbr(String state_abbr) {
        this.state_abbr = state_abbr;
    }

    public String getCounty_name() {
        return county_name;
    }

    public void setCounty_name(String county_name) {
        this.county_name = county_name;
    }

    public String getCombined_fips() {
        return combined_fips;
    }

    public void setCombined_fips(String combined_fips) {
        this.combined_fips = combined_fips;
    }

    public void inputfullSet(String[] fullset){
        String[] organized = organizeData(fullset);
        //System.out.println(fullset[0]);
        setVotes_dem(Double.parseDouble(organized[1]));
        setVotes_gop(Double.parseDouble(organized[2]));
        setTotal_votes(Double.parseDouble(organized[3]));
        setPer_dem(Double.parseDouble(organized[4]));
        setPer_gop(Double.parseDouble(organized[5]));
        setDiff(organized[6]);
        setPer_point_diff(Double.parseDouble(organized[7]));
        setState_abbr(organized[8]);
        setCounty_name(organized[9]);
        setCombined_fips(organized[10]);
    }

    private String[] organizeData(String[] fullset) {
        String[] newSet = new String[20];
        if (fullset.length != NormLength){
            for (int j = 1; j < fullset.length; j++) {
                String s = fullset[j];
                if(s.contains("%") || s.contains("\"")) s = removeUnneeded(fullset[j]);
                newSet[j] = s;
            }
        } else {
            for (int i = 1; i < fullset.length; i++) {
                String s = fullset[i];
                if(s.contains("%") || s.contains("\"")) s = removeUnneeded(fullset[i]);
                if(i == 7) s = (removeUnneeded(fullset[i - 1]) + ", " + removeUnneeded(fullset[i]));
                if(i >= 7) newSet[i - 1] = s;
                newSet[i] = s;
            }
        }
        return newSet;
    }

    private String removeUnneeded(String s) {
        int indexOfUnneeded = s.indexOf("%");
        if(indexOfUnneeded == -1) indexOfUnneeded = s.indexOf("\"");
        else return removeUnneeded(s.substring(0, indexOfUnneeded) + s.substring(indexOfUnneeded + 1));

        if(indexOfUnneeded == -1) return s;
        return removeUnneeded(s.substring(0, indexOfUnneeded) + s.substring(indexOfUnneeded + 1));
    }

    public  String toString(){
        String output = (votes_dem + ", " + votes_gop + ", " + total_votes + ", " + per_dem + ", " + per_gop  + ", " + diff + ", " + per_point_diff + ", " + state_abbr + ", " + county_name + ", " + combined_fips);
        return output;
    }
}