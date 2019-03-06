public class ElectionResult {
    public int votes_dem;
    public int votes_gop;
    public int total_votes;
    public double per_dem;
    public double per_gop;
    public String diff;
    public double per_point_diff;
    public String state_abbr;
    public String county_name;
    public String combined_fips;

    public int getVotes_dem() {
        return votes_dem;
    }

    public void setVotes_dem(int votes_dem) {
        this.votes_dem = votes_dem;
    }

    public int getVotes_gop() {
        return votes_gop;
    }

    public void setVotes_gop(int votes_gop) {
        this.votes_gop = votes_gop;
    }

    public int getTotal_votes() {
        return total_votes;
    }

    public void setTotal_votes(int total_votes) {
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
}