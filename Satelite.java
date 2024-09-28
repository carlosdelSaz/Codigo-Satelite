
import java.time.LocalDateTime;

public class Satelite {
	private String SatelliteName;
	private String InternationalDesingnator;
	private LocalDateTime Epoch;
	private Double Inclination;
	private Double RAAN;
	private Double Eccentricity;
	private Double ArgumentofPerigee;
	private Double MeanMotion;

	public Satelite(String SatelliteName, String InternationalDesingnator, LocalDateTime Epoch, Double Inclination,
			Double RAAN, Double Eccentricity, Double ArgumentofPerigee, Double MeanMotion) {
		this.SatelliteName = SatelliteName;
		this.InternationalDesingnator = InternationalDesingnator;
		this.Epoch = Epoch;
		this.Inclination = Inclination;
		this.RAAN = RAAN;
		this.Eccentricity = Eccentricity;
		this.ArgumentofPerigee = ArgumentofPerigee;
		this.MeanMotion = MeanMotion;
	}

	public Double getRAAN() {
		return RAAN;
	}

	public void setRAAN(Double rAAN) {
		RAAN = rAAN;
	}

	public Double getEccentricity() {
		return Eccentricity;
	}

	public void setEccentricity(Double eccentricity) {
		Eccentricity = eccentricity;
	}

	public Double getArgumentofPerigee() {
		return ArgumentofPerigee;
	}

	public void setArgumentofPerigee(Double argumentofPerigee) {
		ArgumentofPerigee = argumentofPerigee;
	}

	public Double getMeanMotion() {
		return MeanMotion;
	}

	public void setMeanMotion(Double meanMotion) {
		MeanMotion = meanMotion;
	}

	public String getSatelliteName() {
		return SatelliteName;
	}

	public void setSatelliteName(String satelliteName) {
		SatelliteName = satelliteName;
	}

	public String getInternationalDesingnator() {
		return InternationalDesingnator;
	}

	public void setInternationalDesingnator(String internationalDesingnator) {
		InternationalDesingnator = internationalDesingnator;
	}

	public LocalDateTime getEpoch() {
		return Epoch;
	}

	public void setEpoch(LocalDateTime epoch) {
		Epoch = epoch;
	}

	public Double getInclination() {
		return Inclination;
	}

	public void setInclination(Double inclination) {
		Inclination = inclination;
	}

	// metodo lectura

	public void LeerDatos(String[] datos) {

		this.SatelliteName = datos[0];
		this.InternationalDesingnator = datos[1];
		this.Epoch = LocalDateTime.parse(datos[2]);
		this.Inclination = Double.valueOf(datos[3]);
		this.RAAN = Double.valueOf(datos[4]);
		this.Eccentricity = Double.valueOf(datos[5]);
		this.ArgumentofPerigee = Double.valueOf(datos[6]);
		this.MeanMotion = Double.valueOf(datos[7]);

	}

	@Override
	public String toString() {
		return "Satelite [SatelliteName=" + SatelliteName + ", InternationalDesingnator=" + InternationalDesingnator
				+ ", Epoch=" + Epoch + ", Inclination=" + Inclination + ", RAAN=" + RAAN + ", Eccentricity="
				+ Eccentricity + ", ArgumentofPerigee=" + ArgumentofPerigee + ", MeanMotion=" + MeanMotion + "]";
	}

	
	
	
}
