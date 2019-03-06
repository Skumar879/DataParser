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
        setVotes_dem(Double.parseDouble(fullset[1]));
        setVotes_gop(Double.parseDouble(fullset[2]));
        setTotal_votes(Double.parseDouble(fullset[3]));
        setPer_dem(Double.parseDouble(fullset[4]));
        setPer_gop(Double.parseDouble(fullset[5]));
        setDiff(fullset[6]);
        setPer_point_diff(Double.parseDouble(fullset[7]));
        setState_abbr(fullset[8]);
        setCounty_name(fullset[9]);
        setCombined_fips(fullset[10]);
    }
}