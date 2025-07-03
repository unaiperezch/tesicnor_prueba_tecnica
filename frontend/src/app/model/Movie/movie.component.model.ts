export class Movie {
  uuid: string;
  title: string;
  year: string;
  plot: string;

  constructor(id: string, title: string, year: string, plot: string) {
    this.uuid = id;
    this.title = title;
    this.year = year;
    this.plot = plot;
  }
}
