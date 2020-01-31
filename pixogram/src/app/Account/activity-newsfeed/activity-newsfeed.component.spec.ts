import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ActivityNewsfeedComponent } from './activity-newsfeed.component';

describe('ActivityNewsfeedComponent', () => {
  let component: ActivityNewsfeedComponent;
  let fixture: ComponentFixture<ActivityNewsfeedComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ActivityNewsfeedComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ActivityNewsfeedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
