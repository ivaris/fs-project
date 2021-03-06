import { Component, OnInit } from '@angular/core';
import { Job } from '../domains/job';
import { JobService }  from '../providers/job.service';

@Component({
  selector: 'job-list',
  templateUrl: '../views/joblist.view.html',
  styleUrls: ['../styles/joblist.style.css'],
  providers: [JobService]
})
export class JobListComponent implements OnInit {

  title = 'Job List';
  jobs: Job[];
  selectedJob: {};
  constructor(private jobService: JobService) { }
  getJobs(): void {
    this.jobService.getJobsMock().then(jobs => this.jobs = jobs);
  }
  ngOnInit(): void {
    this.getJobs();
  }

}
