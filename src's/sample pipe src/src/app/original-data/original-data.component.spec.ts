import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OriginalDataComponent } from './original-data.component';

describe('OriginalDataComponent', () => {
  let component: OriginalDataComponent;
  let fixture: ComponentFixture<OriginalDataComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OriginalDataComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OriginalDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
