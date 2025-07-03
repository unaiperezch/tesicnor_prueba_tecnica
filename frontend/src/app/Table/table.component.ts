import { Component, inject } from '@angular/core';
import { Movie } from '../model/Movie/movie.component.model';
import { MovieServiceService } from '../movie-service.service';
import { TableModule } from 'primeng/table';
import { ButtonModule } from 'primeng/button';
import { AsyncPipe, CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-table-component',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css'],
  standalone: true,
  imports: [TableModule, ButtonModule, AsyncPipe, CommonModule, FormsModule],
})
export class TableComponent {
  allMovies!: Movie[];
  filteredMovies!: Movie[];
  yearFilter: string = '';
  titleFilter: string = '';

  movieService: MovieServiceService = inject(MovieServiceService);

  ngOnInit(): void {
    this.fetchAllMovies();
    this.filteredMovies = this.allMovies;
  }

  fetchAllMovies(): void {
    this.movieService.getMovies().subscribe((movies) => {
      this.allMovies = movies;
    });
  }

  filterMovies() {
    this.filteredMovies = this.allMovies.filter(movie =>
      movie.title.toLowerCase().includes(this.titleFilter.toLowerCase()) &&
      movie.year.includes(this.yearFilter)
    );
  }
}
