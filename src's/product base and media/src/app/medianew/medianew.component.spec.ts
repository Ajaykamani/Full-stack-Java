import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MedianewComponent } from './medianew.component';

describe('MedianewComponent', () => {
  let component: MedianewComponent;
  let fixture: ComponentFixture<MedianewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MedianewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MedianewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
