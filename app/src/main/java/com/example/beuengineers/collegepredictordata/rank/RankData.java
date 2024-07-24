package com.example.beuengineers.collegepredictordata.rank;

public class RankData {
    private String Institute;
    private String AcademicProgramName;
    private String Quota;
    private String SeatType;
    private String Gender;
    private int OpeningRank;
    private int ClosingRank;
    private int Year;
    private int Round;

    // Getters and setters
    public String getInstitute() { return Institute; }
    public void setInstitute(String institute) { Institute = institute; }

    public String getAcademicProgramName() { return AcademicProgramName; }
    public void setAcademicProgramName(String academicProgramName) { AcademicProgramName = academicProgramName; }

    public String getQuota() { return Quota; }
    public void setQuota(String quota) { Quota = quota; }

    public String getSeatType() { return SeatType; }
    public void setSeatType(String seatType) { SeatType = seatType; }

    public String getGender() { return Gender; }
    public void setGender(String gender) { Gender = gender; }

    public int getOpeningRank() { return OpeningRank; }
    public void setOpeningRank(int openingRank) { OpeningRank = openingRank; }

    public int getClosingRank() { return ClosingRank; }
    public void setClosingRank(int closingRank) { ClosingRank = closingRank; }

    public int getYear() { return Year; }
    public void setYear(int year) { Year = year; }

    public int getRound() { return Round; }
    public void setRound(int round) { Round = round; }
}
